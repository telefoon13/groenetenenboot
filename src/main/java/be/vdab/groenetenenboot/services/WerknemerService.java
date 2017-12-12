package be.vdab.groenetenenboot.services;

import be.vdab.groenetenenboot.entities.Werknemer;

import java.util.List;
import java.util.Optional;

public interface WerknemerService {

	List<Werknemer> findByVoornaam(String voornaam);
	Optional<Werknemer> read(long id);
}
