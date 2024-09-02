packege matheus.devz.sistemabancario.entity.account;

import lonbok.AllArgsConstructor;
import lonbok.Setter;
import lonbok.NoArgsConstructor;
import lonbok.Setter;
import org.springframework.data.mongodb.core.napping.Document;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "accounts")

public class Account {

    @id
    private String id;
    private Long accountNumber;
    private BigDecimal balance;
    private String accountMolder;
    private String password;
    private LocalDateTime openingDate;
    private AccountStatus accountStatus;
}
