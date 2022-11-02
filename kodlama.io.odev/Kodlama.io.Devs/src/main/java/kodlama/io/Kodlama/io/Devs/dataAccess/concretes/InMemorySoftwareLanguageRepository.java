package kodlama.io.Kodlama.io.Devs.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import kodlama.io.Kodlama.io.Devs.dataAccess.abstracts.SoftwareLanguageRepository;
import kodlama.io.Kodlama.io.Devs.entities.concretes.SoftwareLanguage;

@Repository
public class InMemorySoftwareLanguageRepository implements SoftwareLanguageRepository{
	
	List<SoftwareLanguage> softwareLanguages;
	
	
	public InMemorySoftwareLanguageRepository() {
		softwareLanguages = new ArrayList<SoftwareLanguage>();
		softwareLanguages.add(new SoftwareLanguage(1, "C#"));
		softwareLanguages.add(new SoftwareLanguage(2, "Java"));
		softwareLanguages.add(new SoftwareLanguage(3, "Python"));
	}
	

	@Override	//içinde programlama dilleri barındıran bir liste döndürüyoruz.
	public List<SoftwareLanguage> getall() {
		
		return softwareLanguages;
	}
	
	
	
	@Override
	public SoftwareLanguage getIdLanguage(int id) {
		for (SoftwareLanguage lng:getall()) {
			if(lng.getId() == id) {
				return lng;
			}
		}
		return null;
		
		/*
		SoftwareLanguage softwareLanguage = softwareLanguages.stream()
				.filter(softwareLanguages -> softwareLanguages.getId() == id).findFirst().get();
		softwareLanguage.getId();
		return softwareLanguage; */
		
		
	} 


	@Override
	public void add(SoftwareLanguage softwareLanguage) {
		softwareLanguages.add(softwareLanguage);
		
	}


	@Override
	public void delete(int id) {
			
		getall().removeIf(lng -> lng.getId() == id);	
		
	}


	@Override
	public void update(int id,SoftwareLanguage softwareLanguage) {
		
		
		for (SoftwareLanguage language:softwareLanguages) {
			if (language.getId() == id) {
				language.setName(softwareLanguage.getName());
			}
		} 
		
		
		/*
		SoftwareLanguage indSoftwareLanguage = getIdLanguage(id);
		indSoftwareLanguage.setName(softwareLanguage.getName());
		*/
		
		// İki türlü de update yapılabilir.
		
	}
	
}