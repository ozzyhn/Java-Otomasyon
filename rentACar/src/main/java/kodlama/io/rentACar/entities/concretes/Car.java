package kodlama.io.rentACar.entities.concretes;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Table(name="cars")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity

public class Car {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;

	@Column(name="plate", unique= true)
	private String plate;
	
	@Column(name="dailyprice")
	private double dailyprice;
	
	@Column(name="ModelYear")
	private int modelYear;
	
	@Column(name="state")
	private String state;    // Araba ne durumda 1-Available 2-Rented 3-Maintance
	
	@ManyToOne
	@JoinColumn(name="model_id")
	private Model model;
	
	@OneToMany(mappedBy="brand")
	private List<Car> cars;
}
