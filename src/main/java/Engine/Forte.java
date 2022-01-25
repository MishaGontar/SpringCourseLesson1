package Engine;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Forte implements Engine{
    private String name = "Forte";
    public Forte(){}
    public Forte(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println("This is engine " + name );
    }
}
