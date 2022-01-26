package Engine;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Forte implements Engine {
    private String name = "Forte";

    @Override
    public void run() {
        System.out.println("This is engine " + name);
    }
}
