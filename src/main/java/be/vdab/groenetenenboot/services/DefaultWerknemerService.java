package be.vdab.groenetenenboot.services;

import be.vdab.groenetenenboot.entities.Werknemer;
import be.vdab.groenetenenboot.repositories.WerknemerRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
class DefaultWerknemerService implements WerknemerService {

	private final WerknemerRepository werknemerRepository;

	public DefaultWerknemerService(WerknemerRepository werknemerRepository) {
		this.werknemerRepository = werknemerRepository;
	}

	@Override
	public List<Werknemer> findByVoornaam(String voornaam) {
		return werknemerRepository.findByVoornaam(voornaam);
	}

	@Override
	public Optional<Werknemer> read(long id) {
		return Optional.ofNullable(werknemerRepository.findOne(id));
	}
}
