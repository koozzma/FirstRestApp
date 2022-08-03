package ru.koozma.FirstRestApp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.koozma.FirstRestApp.models.Measurement;

import java.util.List;

public interface MeasurementRepository extends JpaRepository<Measurement,Integer> {

    List<Measurement> findBySensorName(String sensor);


}
