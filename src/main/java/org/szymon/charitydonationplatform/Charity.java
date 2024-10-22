package org.szymon.charitydonationplatform;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Charity {
    private int id;
    private String name;
    private String description;
    private int donation_total;
}
