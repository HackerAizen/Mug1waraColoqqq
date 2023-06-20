package hse.dymovand.cinema.repository;

import hse.dymovand.cinema.model.ShowTime;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ShowTimeRepository extends JpaRepository<ShowTime, Long> {
}