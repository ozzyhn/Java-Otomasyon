package kodlama.io.rentACar.core.utilities.mappers;

import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class ModelMapperManager  implements  ModelMapperService{
	private ModelMapper modelMapper; // 50 TANE ÜRETMEK YERİNE 1 TANE ÜRETMESİ İÇİN
	
	@Override
	public ModelMapper forResponse() {
		this.modelMapper.getConfiguration()
		.setAmbiguityIgnored(true) //Belirsizlik olması durumunda ignore la ben bilinçli yapıyorum demek
		.setMatchingStrategy(MatchingStrategies.LOOSE);
		return this.modelMapper;

	}
	@Override
	public ModelMapper forRequest() {
		this.modelMapper.getConfiguration()
		.setAmbiguityIgnored(true)
		.setMatchingStrategy(MatchingStrategies.STANDARD);
		return this.modelMapper;
	}

}
