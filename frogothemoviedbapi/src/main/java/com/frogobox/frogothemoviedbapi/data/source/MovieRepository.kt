package com.frogobox.frogothemoviedbapi.data.source

import android.content.Context
import com.frogobox.frogothemoviedbapi.data.model.CertificationMovie
import com.frogobox.frogothemoviedbapi.data.model.CertificationTv
import com.frogobox.frogothemoviedbapi.data.response.*

/**
 * Created by Faisal Amir
 * FrogoBox Inc License
 * =========================================
 * TMDBAPI
 * Copyright (C) 10/03/2020.
 * All rights reserved
 * -----------------------------------------
 * Name     : Muhammad Faisal Amir
 * E-mail   : faisalamircs@gmail.com
 * Github   : github.com/amirisback
 * LinkedIn : linkedin.com/in/faisalamircs
 * -----------------------------------------
 * FrogoBox Software Industries
 * com.frogobox.frogothemoviedbapi.data.source
 *
 */
class MovieRepository(private val remoteDataSource: MovieRemoteDataSource) : MovieDataSource {

    override fun usingChuckInterceptor(context: Context) {
        remoteDataSource.usingChuckInterceptor(context)
    }

    override fun getMovieCertifications(
        apiKey: String,
        callback: MovieDataSource.GetRemoteCallback<Certifications<CertificationMovie>>
    ) {
        remoteDataSource.getMovieCertifications(apiKey, callback)
    }

    override fun getTvCertifications(
        apiKey: String,
        callback: MovieDataSource.GetRemoteCallback<Certifications<CertificationTv>>
    ) {
        remoteDataSource.getTvCertifications(apiKey, callback)
    }

    override fun getMovieChangeList(
        apiKey: String,
        endDate: String?,
        startDate: String?,
        page: String?,
        callback: MovieDataSource.GetRemoteCallback<Changes>
    ) {
        remoteDataSource.getMovieChangeList(apiKey, endDate, startDate, page, callback)
    }

    override fun getTvChangeList(
        apiKey: String,
        endDate: String?,
        startDate: String?,
        page: String?,
        callback: MovieDataSource.GetRemoteCallback<Changes>
    ) {
        remoteDataSource.getTvChangeList(apiKey, endDate, startDate, page, callback)
    }

    override fun getPersonChangeList(
        apiKey: String,
        endDate: String?,
        startDate: String?,
        page: String?,
        callback: MovieDataSource.GetRemoteCallback<Changes>
    ) {
        remoteDataSource.getPersonChangeList(apiKey, endDate, startDate, page, callback)
    }

    override fun getCollectionDetails(
        collection_id: Int,
        apiKey: String,
        language: String?,
        callback: MovieDataSource.GetRemoteCallback<CollectionsDetail>
    ) {
        remoteDataSource.getCollectionDetails(collection_id, apiKey, language, callback)
    }

    override fun getCollectionImages(
        collection_id: Int,
        apiKey: String,
        language: String?,
        callback: MovieDataSource.GetRemoteCallback<CollectionsImage>
    ) {
        remoteDataSource.getCollectionImages(collection_id, apiKey, language, callback)
    }

    override fun getCollectionTranslations(
        collection_id: Int,
        apiKey: String,
        language: String?,
        callback: MovieDataSource.GetRemoteCallback<CollectionsTranslation>
    ) {
        remoteDataSource.getCollectionTranslations(collection_id, apiKey, language, callback)
    }

    override fun getCompaniesDetails(
        company_id: Int,
        apiKey: String,
        callback: MovieDataSource.GetRemoteCallback<CompaniesDetail>
    ) {
        remoteDataSource.getCompaniesDetails(company_id, apiKey, callback)
    }

    override fun getCompaniesAlternativeName(
        company_id: Int,
        apiKey: String,
        callback: MovieDataSource.GetRemoteCallback<CompaniesAlternateName>
    ) {
        remoteDataSource.getCompaniesAlternativeName(company_id, apiKey, callback)
    }

    override fun getCompaniesImage(
        company_id: Int,
        apiKey: String,
        callback: MovieDataSource.GetRemoteCallback<CompaniesImage>
    ) {
        remoteDataSource.getCompaniesImage(company_id, apiKey, callback)
    }
}