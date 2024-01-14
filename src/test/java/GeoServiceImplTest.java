import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.internal.matchers.apachecommons.ReflectionEquals;
import ru.netology.entity.Location;
import ru.netology.geo.GeoService;
import ru.netology.geo.GeoServiceImpl;

public class GeoServiceImplTest {
        @Test
        void testByIp () {
            GeoService geoService = new GeoServiceImpl();
            Location actual = geoService.byIp("127.0.0.1");
            Location expected = new Location(null, null, null, 0);
            Assertions.assertTrue(new ReflectionEquals(expected).matches(actual));
        }
    }