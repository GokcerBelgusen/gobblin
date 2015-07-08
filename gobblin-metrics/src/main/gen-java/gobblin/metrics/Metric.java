/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package gobblin.metrics;  
@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class Metric extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"Metric\",\"namespace\":\"gobblin.metrics\",\"fields\":[{\"name\":\"name\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"},\"doc\":\"Metric name.\"},{\"name\":\"value\",\"type\":\"double\",\"doc\":\"Metric value.\"}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  /** Metric name. */
  @Deprecated public java.lang.String name;
  /** Metric value. */
  @Deprecated public double value;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>. 
   */
  public Metric() {}

  /**
   * All-args constructor.
   */
  public Metric(java.lang.String name, java.lang.Double value) {
    this.name = name;
    this.value = value;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return name;
    case 1: return value;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: name = (java.lang.String)value$; break;
    case 1: value = (java.lang.Double)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'name' field.
   * Metric name.   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Sets the value of the 'name' field.
   * Metric name.   * @param value the value to set.
   */
  public void setName(java.lang.String value) {
    this.name = value;
  }

  /**
   * Gets the value of the 'value' field.
   * Metric value.   */
  public java.lang.Double getValue() {
    return value;
  }

  /**
   * Sets the value of the 'value' field.
   * Metric value.   * @param value the value to set.
   */
  public void setValue(java.lang.Double value) {
    this.value = value;
  }

  /** Creates a new Metric RecordBuilder */
  public static gobblin.metrics.Metric.Builder newBuilder() {
    return new gobblin.metrics.Metric.Builder();
  }
  
  /** Creates a new Metric RecordBuilder by copying an existing Builder */
  public static gobblin.metrics.Metric.Builder newBuilder(gobblin.metrics.Metric.Builder other) {
    return new gobblin.metrics.Metric.Builder(other);
  }
  
  /** Creates a new Metric RecordBuilder by copying an existing Metric instance */
  public static gobblin.metrics.Metric.Builder newBuilder(gobblin.metrics.Metric other) {
    return new gobblin.metrics.Metric.Builder(other);
  }
  
  /**
   * RecordBuilder for Metric instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<Metric>
    implements org.apache.avro.data.RecordBuilder<Metric> {

    private java.lang.String name;
    private double value;

    /** Creates a new Builder */
    private Builder() {
      super(gobblin.metrics.Metric.SCHEMA$);
    }
    
    /** Creates a Builder by copying an existing Builder */
    private Builder(gobblin.metrics.Metric.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.name)) {
        this.name = data().deepCopy(fields()[0].schema(), other.name);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.value)) {
        this.value = data().deepCopy(fields()[1].schema(), other.value);
        fieldSetFlags()[1] = true;
      }
    }
    
    /** Creates a Builder by copying an existing Metric instance */
    private Builder(gobblin.metrics.Metric other) {
            super(gobblin.metrics.Metric.SCHEMA$);
      if (isValidValue(fields()[0], other.name)) {
        this.name = data().deepCopy(fields()[0].schema(), other.name);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.value)) {
        this.value = data().deepCopy(fields()[1].schema(), other.value);
        fieldSetFlags()[1] = true;
      }
    }

    /** Gets the value of the 'name' field */
    public java.lang.String getName() {
      return name;
    }
    
    /** Sets the value of the 'name' field */
    public gobblin.metrics.Metric.Builder setName(java.lang.String value) {
      validate(fields()[0], value);
      this.name = value;
      fieldSetFlags()[0] = true;
      return this; 
    }
    
    /** Checks whether the 'name' field has been set */
    public boolean hasName() {
      return fieldSetFlags()[0];
    }
    
    /** Clears the value of the 'name' field */
    public gobblin.metrics.Metric.Builder clearName() {
      name = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /** Gets the value of the 'value' field */
    public java.lang.Double getValue() {
      return value;
    }
    
    /** Sets the value of the 'value' field */
    public gobblin.metrics.Metric.Builder setValue(double value) {
      validate(fields()[1], value);
      this.value = value;
      fieldSetFlags()[1] = true;
      return this; 
    }
    
    /** Checks whether the 'value' field has been set */
    public boolean hasValue() {
      return fieldSetFlags()[1];
    }
    
    /** Clears the value of the 'value' field */
    public gobblin.metrics.Metric.Builder clearValue() {
      fieldSetFlags()[1] = false;
      return this;
    }

    @Override
    public Metric build() {
      try {
        Metric record = new Metric();
        record.name = fieldSetFlags()[0] ? this.name : (java.lang.String) defaultValue(fields()[0]);
        record.value = fieldSetFlags()[1] ? this.value : (java.lang.Double) defaultValue(fields()[1]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}
