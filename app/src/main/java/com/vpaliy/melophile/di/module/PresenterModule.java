package com.vpaliy.melophile.di.module;

import com.vpaliy.domain.interactor.GetPlaylists;
import com.vpaliy.domain.interactor.GetTracks;
import com.vpaliy.melophile.ui.playlists.PlaylistsContract;
import com.vpaliy.melophile.ui.playlists.PlaylistsPresenter;
import com.vpaliy.melophile.di.scope.ViewScope;
import com.vpaliy.melophile.ui.tracks.TracksContract;
import com.vpaliy.melophile.ui.tracks.TracksPresenter;

import dagger.Module;
import dagger.Provides;

@Module
public class PresenterModule {
    @ViewScope @Provides
    PlaylistsContract.Presenter playlists(GetPlaylists getPlaylists){
        return new PlaylistsPresenter(getPlaylists);
    }

    @ViewScope @Provides
    TracksContract.Presenter tracks(GetTracks getTracks){
        return new TracksPresenter(getTracks);
    }
}
