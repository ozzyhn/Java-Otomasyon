package kodlama.io.rentACar.Business.requests;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UpdateBrandRequest {
	private int id; //Update yaparken İD de lazım olur ismin yanında
	private String name;

}
