package ci.digitalacademy.monetab.services.mapper;

import ci.digitalacademy.monetab.models.Adresse;
import ci.digitalacademy.monetab.services.dto.AddressDTO;

public final class AddressMapper {

    private AddressMapper() {}

    public static AddressDTO toDto(Adresse adresse) {
        AddressDTO addressDTO = new AddressDTO();
        addressDTO.setId(adresse.getId());
        addressDTO.setCity(adresse.getCity());
        addressDTO.setStreet(adresse.getStreet());
        addressDTO.setCountry(adresse.getCountry());
        return addressDTO;
    }

    public static Adresse toEntity(AddressDTO addressDTO) {
        Adresse adresse = new Adresse();
        adresse.setId(addressDTO.getId());
        adresse.setCity(addressDTO.getCity());
        adresse.setStreet(addressDTO.getStreet());
        adresse.setCountry(addressDTO.getCountry());
        return adresse;
    }
}
