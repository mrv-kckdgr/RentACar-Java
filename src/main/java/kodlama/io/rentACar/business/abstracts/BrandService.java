package kodlama.io.rentACar.business.abstracts;

import java.util.List;

import kodlama.io.rentACar.entities.concretes.Brand;

public interface BrandService {
	List<Brand> getAll();
	
	Brand getById(int id);
}
