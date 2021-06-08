package com.gscaltex.mobile.ebdr.domains;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Embeddable;
import java.time.LocalDateTime;

@Getter @Setter
@Embeddable
public class RegisterInfo {
    private String REG_ID;
    private LocalDateTime REG_DATE;
    private String UPD_ID;
    private LocalDateTime UPD_DATE;
}
