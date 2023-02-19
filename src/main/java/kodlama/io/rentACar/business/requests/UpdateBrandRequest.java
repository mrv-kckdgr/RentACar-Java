package kodlama.io.rentACar.business.requests;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class UpdateBrandRequest {
	private int id;
	private String name;
}
