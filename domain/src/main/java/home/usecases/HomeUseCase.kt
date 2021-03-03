package home.usecases

import home.repositories.HomeRepository

class HomeUseCase(private val homeRepository: HomeRepository) {
    suspend operator fun invoke() = homeRepository.getWidgetList()
}