import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class QuantityMeasurementAppTest {

    @Test
    public void testEquality_SameValue() {
        src.com.apps.quantitymeasurement.QuantityMeasurementApp.Feet f1 =
                new src.com.apps.quantitymeasurement.QuantityMeasurementApp.Feet(1.0);
        src.com.apps.quantitymeasurement.QuantityMeasurementApp.Feet f2 =
                new src.com.apps.quantitymeasurement.QuantityMeasurementApp.Feet(1.0);

        assertTrue(f1.equals(f2));
    }

    @Test
    public void testEquality_DifferentValue() {
        src.com.apps.quantitymeasurement.QuantityMeasurementApp.Feet f1 =
                new src.com.apps.quantitymeasurement.QuantityMeasurementApp.Feet(1.0);
        src.com.apps.quantitymeasurement.QuantityMeasurementApp.Feet f2 =
                new src.com.apps.quantitymeasurement.QuantityMeasurementApp.Feet(2.0);

        assertFalse(f1.equals(f2));
    }

    @Test
    public void testEquality_NullComparison() {
        src.com.apps.quantitymeasurement.QuantityMeasurementApp.Feet f1 =
                new src.com.apps.quantitymeasurement.QuantityMeasurementApp.Feet(1.0);

        assertFalse(f1.equals(null));
    }

    @Test
    public void testEquality_NonNumericInput() {
        src.com.apps.quantitymeasurement.QuantityMeasurementApp.Feet f1 =
                new src.com.apps.quantitymeasurement.QuantityMeasurementApp.Feet(1.0);

        assertFalse(f1.equals("abc"));
    }

    @Test
    public void testEquality_SameReference() {
        src.com.apps.quantitymeasurement.QuantityMeasurementApp.Feet f1 =
                new src.com.apps.quantitymeasurement.QuantityMeasurementApp.Feet(1.0);

        assertTrue(f1.equals(f1));
    }
}