package org.szymon.charitydonationplatform;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CharityServiceImplementation implements CharityService {
    private CharityRepository charity_repository;

    public CharityServiceImplementation(CharityRepository a_charity_repository) {
        this.charity_repository = a_charity_repository;
    }

    public List<Charity> get_charities() {
        return charity_repository.get_charities();
    }
}
