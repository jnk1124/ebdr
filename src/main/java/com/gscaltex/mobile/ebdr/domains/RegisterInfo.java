package com.gscaltex.mobile.ebdr.domains;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.convert.Jsr310Converters;

import javax.persistence.Embeddable;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Getter @Setter
@NoArgsConstructor

@Embeddable
public class RegisterInfo {
    private String REG_ID;
    private LocalDateTime REG_DATE;
    private String UPD_ID;
    private LocalDateTime UPD_DATE;

    public RegisterInfo(String regId, String regDate, String updId){
        this.REG_ID = regId;
        this.UPD_ID = updId;
        this.UPD_DATE = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        this.REG_DATE = LocalDateTime.parse(regDate, formatter);
    }
}
