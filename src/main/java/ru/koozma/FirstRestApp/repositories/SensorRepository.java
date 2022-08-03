package ru.koozma.FirstRestApp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.koozma.FirstRestApp.models.Sensor;

import java.util.Optional;

public interface SensorRepository extends JpaRepository<Sensor,Integer> {

    Optional<Sensor> findByName(String name);
}
