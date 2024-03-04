package dev.exercise.Spring.Repositories1.repositories;

import dev.exercise.Spring.Repositories1.entities.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface CarRepository extends JpaRepository<Car,Long> {
}
