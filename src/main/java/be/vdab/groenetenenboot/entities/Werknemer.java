package be.vdab.groenetenenboot.entities;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "werknemers")
public class Werknemer implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String voornaam;
	private String familienaam;

	public long getId() {
		return id;
	}

	public String getVoornaam() {
		return voornaam;
	}

	public String getFamilienaam() {
		return familienaam;
	}

}
