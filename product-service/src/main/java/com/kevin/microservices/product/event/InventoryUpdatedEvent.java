/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package com.kevin.microservices.product.event;

import org.apache.avro.generic.GenericArray;
import org.apache.avro.specific.SpecificData;
import org.apache.avro.util.Utf8;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.SchemaStore;

@org.apache.avro.specific.AvroGenerated
public class InventoryUpdatedEvent extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = -4467177983882305742L;


  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"InventoryUpdatedEvent\",\"namespace\":\"com.kevin.microservices.product.event\",\"fields\":[{\"name\":\"skuCode\",\"type\":\"string\"},{\"name\":\"quantity\",\"type\":\"string\"}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static final SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<InventoryUpdatedEvent> ENCODER =
      new BinaryMessageEncoder<>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<InventoryUpdatedEvent> DECODER =
      new BinaryMessageDecoder<>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageEncoder instance used by this class.
   * @return the message encoder used by this class
   */
  public static BinaryMessageEncoder<InventoryUpdatedEvent> getEncoder() {
    return ENCODER;
  }

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   * @return the message decoder used by this class
   */
  public static BinaryMessageDecoder<InventoryUpdatedEvent> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   * @return a BinaryMessageDecoder instance for this class backed by the given SchemaStore
   */
  public static BinaryMessageDecoder<InventoryUpdatedEvent> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<>(MODEL$, SCHEMA$, resolver);
  }

  /**
   * Serializes this InventoryUpdatedEvent to a ByteBuffer.
   * @return a buffer holding the serialized data for this instance
   * @throws java.io.IOException if this instance could not be serialized
   */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /**
   * Deserializes a InventoryUpdatedEvent from a ByteBuffer.
   * @param b a byte buffer holding serialized data for an instance of this class
   * @return a InventoryUpdatedEvent instance decoded from the given buffer
   * @throws java.io.IOException if the given bytes could not be deserialized into an instance of this class
   */
  public static InventoryUpdatedEvent fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  private java.lang.CharSequence skuCode;
  private java.lang.CharSequence quantity;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public InventoryUpdatedEvent() {}

  /**
   * All-args constructor.
   * @param skuCode The new value for skuCode
   * @param quantity The new value for quantity
   */
  public InventoryUpdatedEvent(java.lang.CharSequence skuCode, java.lang.CharSequence quantity) {
    this.skuCode = skuCode;
    this.quantity = quantity;
  }

  @Override
  public org.apache.avro.specific.SpecificData getSpecificData() { return MODEL$; }

  @Override
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }

  // Used by DatumWriter.  Applications should not call.
  @Override
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return skuCode;
    case 1: return quantity;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  // Used by DatumReader.  Applications should not call.
  @Override
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: skuCode = (java.lang.CharSequence)value$; break;
    case 1: quantity = (java.lang.CharSequence)value$; break;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  /**
   * Gets the value of the 'skuCode' field.
   * @return The value of the 'skuCode' field.
   */
  public java.lang.CharSequence getSkuCode() {
    return skuCode;
  }


  /**
   * Sets the value of the 'skuCode' field.
   * @param value the value to set.
   */
  public void setSkuCode(java.lang.CharSequence value) {
    this.skuCode = value;
  }

  /**
   * Gets the value of the 'quantity' field.
   * @return The value of the 'quantity' field.
   */
  public java.lang.CharSequence getQuantity() {
    return quantity;
  }


  /**
   * Sets the value of the 'quantity' field.
   * @param value the value to set.
   */
  public void setQuantity(java.lang.CharSequence value) {
    this.quantity = value;
  }

  /**
   * Creates a new InventoryUpdatedEvent RecordBuilder.
   * @return A new InventoryUpdatedEvent RecordBuilder
   */
  public static com.kevin.microservices.product.event.InventoryUpdatedEvent.Builder newBuilder() {
    return new com.kevin.microservices.product.event.InventoryUpdatedEvent.Builder();
  }

  /**
   * Creates a new InventoryUpdatedEvent RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new InventoryUpdatedEvent RecordBuilder
   */
  public static com.kevin.microservices.product.event.InventoryUpdatedEvent.Builder newBuilder(com.kevin.microservices.product.event.InventoryUpdatedEvent.Builder other) {
    if (other == null) {
      return new com.kevin.microservices.product.event.InventoryUpdatedEvent.Builder();
    } else {
      return new com.kevin.microservices.product.event.InventoryUpdatedEvent.Builder(other);
    }
  }

  /**
   * Creates a new InventoryUpdatedEvent RecordBuilder by copying an existing InventoryUpdatedEvent instance.
   * @param other The existing instance to copy.
   * @return A new InventoryUpdatedEvent RecordBuilder
   */
  public static com.kevin.microservices.product.event.InventoryUpdatedEvent.Builder newBuilder(com.kevin.microservices.product.event.InventoryUpdatedEvent other) {
    if (other == null) {
      return new com.kevin.microservices.product.event.InventoryUpdatedEvent.Builder();
    } else {
      return new com.kevin.microservices.product.event.InventoryUpdatedEvent.Builder(other);
    }
  }

  /**
   * RecordBuilder for InventoryUpdatedEvent instances.
   */
  @org.apache.avro.specific.AvroGenerated
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<InventoryUpdatedEvent>
    implements org.apache.avro.data.RecordBuilder<InventoryUpdatedEvent> {

    private java.lang.CharSequence skuCode;
    private java.lang.CharSequence quantity;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$, MODEL$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(com.kevin.microservices.product.event.InventoryUpdatedEvent.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.skuCode)) {
        this.skuCode = data().deepCopy(fields()[0].schema(), other.skuCode);
        fieldSetFlags()[0] = other.fieldSetFlags()[0];
      }
      if (isValidValue(fields()[1], other.quantity)) {
        this.quantity = data().deepCopy(fields()[1].schema(), other.quantity);
        fieldSetFlags()[1] = other.fieldSetFlags()[1];
      }
    }

    /**
     * Creates a Builder by copying an existing InventoryUpdatedEvent instance
     * @param other The existing instance to copy.
     */
    private Builder(com.kevin.microservices.product.event.InventoryUpdatedEvent other) {
      super(SCHEMA$, MODEL$);
      if (isValidValue(fields()[0], other.skuCode)) {
        this.skuCode = data().deepCopy(fields()[0].schema(), other.skuCode);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.quantity)) {
        this.quantity = data().deepCopy(fields()[1].schema(), other.quantity);
        fieldSetFlags()[1] = true;
      }
    }

    /**
      * Gets the value of the 'skuCode' field.
      * @return The value.
      */
    public java.lang.CharSequence getSkuCode() {
      return skuCode;
    }


    /**
      * Sets the value of the 'skuCode' field.
      * @param value The value of 'skuCode'.
      * @return This builder.
      */
    public com.kevin.microservices.product.event.InventoryUpdatedEvent.Builder setSkuCode(java.lang.CharSequence value) {
      validate(fields()[0], value);
      this.skuCode = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'skuCode' field has been set.
      * @return True if the 'skuCode' field has been set, false otherwise.
      */
    public boolean hasSkuCode() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'skuCode' field.
      * @return This builder.
      */
    public com.kevin.microservices.product.event.InventoryUpdatedEvent.Builder clearSkuCode() {
      skuCode = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'quantity' field.
      * @return The value.
      */
    public java.lang.CharSequence getQuantity() {
      return quantity;
    }


    /**
      * Sets the value of the 'quantity' field.
      * @param value The value of 'quantity'.
      * @return This builder.
      */
    public com.kevin.microservices.product.event.InventoryUpdatedEvent.Builder setQuantity(java.lang.CharSequence value) {
      validate(fields()[1], value);
      this.quantity = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'quantity' field has been set.
      * @return True if the 'quantity' field has been set, false otherwise.
      */
    public boolean hasQuantity() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'quantity' field.
      * @return This builder.
      */
    public com.kevin.microservices.product.event.InventoryUpdatedEvent.Builder clearQuantity() {
      quantity = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public InventoryUpdatedEvent build() {
      try {
        InventoryUpdatedEvent record = new InventoryUpdatedEvent();
        record.skuCode = fieldSetFlags()[0] ? this.skuCode : (java.lang.CharSequence) defaultValue(fields()[0]);
        record.quantity = fieldSetFlags()[1] ? this.quantity : (java.lang.CharSequence) defaultValue(fields()[1]);
        return record;
      } catch (org.apache.avro.AvroMissingFieldException e) {
        throw e;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<InventoryUpdatedEvent>
    WRITER$ = (org.apache.avro.io.DatumWriter<InventoryUpdatedEvent>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<InventoryUpdatedEvent>
    READER$ = (org.apache.avro.io.DatumReader<InventoryUpdatedEvent>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

  @Override protected boolean hasCustomCoders() { return true; }

  @Override public void customEncode(org.apache.avro.io.Encoder out)
    throws java.io.IOException
  {
    out.writeString(this.skuCode);

    out.writeString(this.quantity);

  }

  @Override public void customDecode(org.apache.avro.io.ResolvingDecoder in)
    throws java.io.IOException
  {
    org.apache.avro.Schema.Field[] fieldOrder = in.readFieldOrderIfDiff();
    if (fieldOrder == null) {
      this.skuCode = in.readString(this.skuCode instanceof Utf8 ? (Utf8)this.skuCode : null);

      this.quantity = in.readString(this.quantity instanceof Utf8 ? (Utf8)this.quantity : null);

    } else {
      for (int i = 0; i < 2; i++) {
        switch (fieldOrder[i].pos()) {
        case 0:
          this.skuCode = in.readString(this.skuCode instanceof Utf8 ? (Utf8)this.skuCode : null);
          break;

        case 1:
          this.quantity = in.readString(this.quantity instanceof Utf8 ? (Utf8)this.quantity : null);
          break;

        default:
          throw new java.io.IOException("Corrupt ResolvingDecoder.");
        }
      }
    }
  }
}









