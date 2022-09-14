package co.com.utest.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PaginaInfoPersonal {
    public static final Target NOMBRE = Target.the("Primer nombre")
            .located(By.id("firstName"));
    public static final Target APELLIDO = Target.the("Apellido")
            .located(By.id("lastName"));
    public static final Target EMAIL = Target.the("Email")
            .located(By.id("email"));
    public static final Target MES_NACIMIENTO = Target.the("Mes de nacimiento")
            .located(By.id("birthMonth"));
    public static final Target DIA_NACIMIENTO = Target.the("Dia de nacimiento")
            .located(By.id("birthDay"));
    public static final Target ANIO_NACIMIENTO = Target.the("Anio de nacimiento")
            .located(By.id("birthYear"));
    public static final Target BOTON_DIRECCION=Target.the("Boton que lleva a la seccion de Direccion")
            .located(By.xpath("//a[@class='btn btn-blue']"));
}
