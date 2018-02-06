@XmlJavaTypeAdapters (
   {
       @XmlJavaTypeAdapter(value=com.ca.gen.vwrt.adapters.BigDecimalAdapter.class,type=java.math.BigDecimal.class),
       @XmlJavaTypeAdapter(value=com.ca.gen.vwrt.adapters.SqlDateAdapter.class,type=java.sql.Date.class),
       @XmlJavaTypeAdapter(value=com.ca.gen.vwrt.adapters.SqlTimeAdapter.class,type=java.sql.Time.class),
       @XmlJavaTypeAdapter(value=com.ca.gen.vwrt.adapters.SqlTimestampAdapter.class,type=java.sql.Timestamp.class)
   }
)
package calculat;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapters;
