package kodlama.io.Kodlama.io.Devs.business.concretes;


import java.util.List;

import org.springframework.stereotype.Service;

import kodlama.io.Kodlama.io.Devs.business.abstracts.SoftwareLanguageService;
import kodlama.io.Kodlama.io.Devs.dataAccess.abstracts.SoftwareLanguageRepository;
import kodlama.io.Kodlama.io.Devs.entities.concretes.SoftwareLanguage;

@Service
public class SoftwareLanguageManager implements SoftwareLanguageService{
	
	private SoftwareLanguageRepository softwareLanguageRepository;
	
	 
	
	public SoftwareLanguageManager(SoftwareLanguageRepository softwareLanguageRepository){
			 
		super();
		this.softwareLanguageRepository = softwareLanguageRepository;
		
	}
	
	
	public boolean isNameExist (SoftwareLanguage softwareLanguage) throws Exception{
		for (SoftwareLanguage lng:softwareLanguageRepository.getall()) {
			if (lng.getName().equals(softwareLanguage.getName())) {
				return true;
			}
			
			if (lng.getName().isEmpty()) {
				return true;
			}
		}
		
		return false;
		
	
	
	}	
	
	public boolean isIdExist (int id) {
		for (SoftwareLanguage lng:getall()) {
			if (lng.getId() == id ) {
				return true;
			}
		}
		return false;
	}
	
	
	
	@Override
	public List<SoftwareLanguage> getall() {
		
		return softwareLanguageRepository.getall();
	}


	@Override
	public void add(SoftwareLanguage softwareLanguage) throws Exception{
		if (isNameExist(softwareLanguage)) {
			throw new Exception("İsim tekrar edemez.");
		}
		if (isIdExist(softwareLanguage.getId())) {
			throw new Exception("İd tekrar edemez.");
		}
		softwareLanguageRepository.add(softwareLanguage);

	}
	
	
	@Override
	public void delete(int id) throws Exception {
		if (!isIdExist(id)) {
			throw new Exception("Kimlik bulanamadı.");
		}
		softwareLanguageRepository.delete(id);
	}



	@Override
	public void update(int id, SoftwareLanguage softwareLanguage) throws Exception {
		if (!isIdExist(id)) {
			throw new Exception("İd bulunamadı.");
		}
		if (isNameExist(softwareLanguage)) {
			throw new Exception("İsim zaten mevcut.");
		}
		softwareLanguageRepository.update(id,softwareLanguage);
}

	
	@Override
	public SoftwareLanguage getIdLanguage(int id){
		
		return softwareLanguageRepository.getIdLanguage(id);
	}
}