package features.choice;

import keyword.Features;
import org.testng.annotations.Test;

import java.io.IOException;

public class FeatureTest extends Features{
    @Test
    public void testFeatures() throws IOException, InterruptedException {
        selectFeatures();
    }
}
