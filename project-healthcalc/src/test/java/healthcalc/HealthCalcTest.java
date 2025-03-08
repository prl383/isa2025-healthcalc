package healthcalc;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Tests para la calculadora de salud.")
public class HealthCalcTest {

    HealthCalc healthCalc = new HealthCalcImpl(); //  inicializamos el objeto

    @Test
    @DisplayName("Esto es un test de ejemplo.")
    public void bmi() {
        assertEquals(true, true);
    }

    // --- TESTS PARA idealWeight ---
    @Test
    void testIdeal_Weight_AlturaNegativaCero() {
        assertThrows(IllegalArgumentException.class, () -> healthCalc.idealWeight(0, 'm'));
        assertThrows(IllegalArgumentException.class, () -> healthCalc.idealWeight(-160, 'm'));
    }

    @Test
    void testIdealWeight_GeneroNoValido() {
        assertThrows(IllegalArgumentException.class, () -> healthCalc.idealWeight(180, 'y'));
    }

    @Test
    void testIdealWeight_AlturasIrreales() {
        assertThrows(IllegalArgumentException.class, () -> healthCalc.idealWeight(10, 'm'));
        assertThrows(IllegalArgumentException.class, () -> healthCalc.idealWeight(10, 'w'));
        assertThrows(IllegalArgumentException.class, () -> healthCalc.idealWeight(400, 'm'));
        assertThrows(IllegalArgumentException.class, () -> healthCalc.idealWeight(400, 'w'));
    }

    @Test
    void testIdealWeight_generoEnMayusculaIncorrecta() {
        assertThrows(IllegalArgumentException.class, () -> healthCalc.idealWeight(150, 'W'));
        assertThrows(IllegalArgumentException.class, () -> healthCalc.idealWeight(150, 'M'));
    }

    //--- TESTS PARA basalMetabolicRate --- 

    @Test
    void testBasalMetabolicRate_PesoCero() {
        assertThrows(IllegalArgumentException.class, () -> healthCalc.basalMetabolicRate(0, 170, 25, 'm'));
    }

    @Test
    void testBasalMetabolicRate_PesoNegativo() {
        assertThrows(IllegalArgumentException.class, () -> healthCalc.basalMetabolicRate(-52, 160, 24, 'w'));
    }

    @Test
    void testBasalMetabolicRate_GeneroNoValido() {
        assertThrows(IllegalArgumentException.class, () -> healthCalc.basalMetabolicRate(52, 160, 24, 'y'));
    }

    @Test
    void testBasalMetabolicRate_EdadIrreal() {
        assertThrows(IllegalArgumentException.class, () -> healthCalc.basalMetabolicRate(52, 160, -24, 'm'));
        assertThrows(IllegalArgumentException.class, () -> healthCalc.basalMetabolicRate(52, 160, 152, 'w'));
        assertThrows(IllegalArgumentException.class, () -> healthCalc.basalMetabolicRate(52, 160, 0, 'w'));

    }

    @Test
    void testBasalMetabolicRate_PesoIrreal() {
        assertThrows(IllegalArgumentException.class, () -> healthCalc.basalMetabolicRate(1, 160, 24, 'm'));  
        assertThrows(IllegalArgumentException.class, () -> healthCalc.basalMetabolicRate(200, 160, 24, 'w')); 
        
    }

}
