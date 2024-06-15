package ru.practicum.android.diploma.favorites.domain.api

import kotlinx.coroutines.flow.Flow
import ru.practicum.android.diploma.favorites.domain.models.VacancyDetailsDB

interface VacansyInteractor {
    suspend fun insertVacancy(vacancy: VacancyDetailsDB)
    suspend fun deleteVacancy(vacancyId: String)
    suspend fun getVacancies(): Flow<List<VacancyDetailsDB>?>
    suspend fun getVacancyById(vacancyId: String): Flow<VacancyDetailsDB>
}
