package kodlama.io.Kodlama.io.Devs.dataAccess.abstracts;

import java.util.List;

import kodlama.io.Kodlama.io.Devs.entities.concretes.SoftwareLanguage;

public interface SoftwareLanguageRepository { //Dao-Repository aynı şeydir.
	List<SoftwareLanguage> getall();
	
	SoftwareLanguage getIdLanguage (int id);
	void add (SoftwareLanguage softwareLanguage);
	void delete (int id);
	void update (int id, SoftwareLanguage softwareLanguage);
}
