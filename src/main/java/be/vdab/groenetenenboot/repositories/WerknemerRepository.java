package be.vdab.groenetenenboot.repositories;

import be.vdab.groenetenenboot.entities.Werknemer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface WerknemerRepository extends JpaRepository<Werknemer, Long> {

	public List<Werknemer> findByVoornaam(String voornaam);

}
