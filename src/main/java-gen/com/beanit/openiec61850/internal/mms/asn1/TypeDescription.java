/** This class file was automatically generated by ASN1bean (http://www.beanit.com) */
package com.beanit.openiec61850.internal.mms.asn1;

import com.beanit.asn1bean.ber.BerLength;
import com.beanit.asn1bean.ber.BerTag;
import com.beanit.asn1bean.ber.ReverseByteArrayOutputStream;
import com.beanit.asn1bean.ber.types.BerNull;
import com.beanit.asn1bean.ber.types.BerType;
import com.beanit.openiec61850.internal.BerBoolean;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TypeDescription implements BerType, Serializable {

  private static final long serialVersionUID = 1L;

  private byte[] code = null;
  private Array array = null;
  private Structure structure = null;
  private BerNull bool = null;
  private Integer32 bitString = null;
  private Unsigned8 integer = null;
  private Unsigned8 unsigned = null;
  private FloatingPoint floatingPoint = null;
  private Integer32 octetString = null;
  private Integer32 visibleString = null;
  private BerBoolean binaryTime = null;
  private Integer32 mMSString = null;
  private BerNull utcTime = null;
  public TypeDescription() {}
  public TypeDescription(byte[] code) {
    this.code = code;
  }

  public Array getArray() {
    return array;
  }

  public void setArray(Array array) {
    this.array = array;
  }

  public Structure getStructure() {
    return structure;
  }

  public void setStructure(Structure structure) {
    this.structure = structure;
  }

  public BerNull getBool() {
    return bool;
  }

  public void setBool(BerNull bool) {
    this.bool = bool;
  }

  public Integer32 getBitString() {
    return bitString;
  }

  public void setBitString(Integer32 bitString) {
    this.bitString = bitString;
  }

  public Unsigned8 getInteger() {
    return integer;
  }

  public void setInteger(Unsigned8 integer) {
    this.integer = integer;
  }

  public Unsigned8 getUnsigned() {
    return unsigned;
  }

  public void setUnsigned(Unsigned8 unsigned) {
    this.unsigned = unsigned;
  }

  public FloatingPoint getFloatingPoint() {
    return floatingPoint;
  }

  public void setFloatingPoint(FloatingPoint floatingPoint) {
    this.floatingPoint = floatingPoint;
  }

  public Integer32 getOctetString() {
    return octetString;
  }

  public void setOctetString(Integer32 octetString) {
    this.octetString = octetString;
  }

  public Integer32 getVisibleString() {
    return visibleString;
  }

  public void setVisibleString(Integer32 visibleString) {
    this.visibleString = visibleString;
  }

  public BerBoolean getBinaryTime() {
    return binaryTime;
  }

  public void setBinaryTime(BerBoolean binaryTime) {
    this.binaryTime = binaryTime;
  }

  public Integer32 getMMSString() {
    return mMSString;
  }

  public void setMMSString(Integer32 mMSString) {
    this.mMSString = mMSString;
  }

  public BerNull getUtcTime() {
    return utcTime;
  }

  public void setUtcTime(BerNull utcTime) {
    this.utcTime = utcTime;
  }

  @Override
  public int encode(OutputStream reverseOS) throws IOException {

    if (code != null) {
      reverseOS.write(code);
      return code.length;
    }

    int codeLength = 0;
    if (utcTime != null) {
      codeLength += utcTime.encode(reverseOS, false);
      // write tag: CONTEXT_CLASS, PRIMITIVE, 17
      reverseOS.write(0x91);
      codeLength += 1;
      return codeLength;
    }

    if (mMSString != null) {
      codeLength += mMSString.encode(reverseOS, false);
      // write tag: CONTEXT_CLASS, PRIMITIVE, 16
      reverseOS.write(0x90);
      codeLength += 1;
      return codeLength;
    }

    if (binaryTime != null) {
      codeLength += binaryTime.encode(reverseOS, false);
      // write tag: CONTEXT_CLASS, PRIMITIVE, 12
      reverseOS.write(0x8C);
      codeLength += 1;
      return codeLength;
    }

    if (visibleString != null) {
      codeLength += visibleString.encode(reverseOS, false);
      // write tag: CONTEXT_CLASS, PRIMITIVE, 10
      reverseOS.write(0x8A);
      codeLength += 1;
      return codeLength;
    }

    if (octetString != null) {
      codeLength += octetString.encode(reverseOS, false);
      // write tag: CONTEXT_CLASS, PRIMITIVE, 9
      reverseOS.write(0x89);
      codeLength += 1;
      return codeLength;
    }

    if (floatingPoint != null) {
      codeLength += floatingPoint.encode(reverseOS, false);
      // write tag: CONTEXT_CLASS, CONSTRUCTED, 7
      reverseOS.write(0xA7);
      codeLength += 1;
      return codeLength;
    }

    if (unsigned != null) {
      codeLength += unsigned.encode(reverseOS, false);
      // write tag: CONTEXT_CLASS, PRIMITIVE, 6
      reverseOS.write(0x86);
      codeLength += 1;
      return codeLength;
    }

    if (integer != null) {
      codeLength += integer.encode(reverseOS, false);
      // write tag: CONTEXT_CLASS, PRIMITIVE, 5
      reverseOS.write(0x85);
      codeLength += 1;
      return codeLength;
    }

    if (bitString != null) {
      codeLength += bitString.encode(reverseOS, false);
      // write tag: CONTEXT_CLASS, PRIMITIVE, 4
      reverseOS.write(0x84);
      codeLength += 1;
      return codeLength;
    }

    if (bool != null) {
      codeLength += bool.encode(reverseOS, false);
      // write tag: CONTEXT_CLASS, PRIMITIVE, 3
      reverseOS.write(0x83);
      codeLength += 1;
      return codeLength;
    }

    if (structure != null) {
      codeLength += structure.encode(reverseOS, false);
      // write tag: CONTEXT_CLASS, CONSTRUCTED, 2
      reverseOS.write(0xA2);
      codeLength += 1;
      return codeLength;
    }

    if (array != null) {
      codeLength += array.encode(reverseOS, false);
      // write tag: CONTEXT_CLASS, CONSTRUCTED, 1
      reverseOS.write(0xA1);
      codeLength += 1;
      return codeLength;
    }

    throw new IOException("Error encoding CHOICE: No element of CHOICE was selected.");
  }

  @Override
  public int decode(InputStream is) throws IOException {
    return decode(is, null);
  }

  public int decode(InputStream is, BerTag berTag) throws IOException {

    int tlvByteCount = 0;
    boolean tagWasPassed = (berTag != null);

    if (berTag == null) {
      berTag = new BerTag();
      tlvByteCount += berTag.decode(is);
    }

    if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.CONSTRUCTED, 1)) {
      array = new Array();
      tlvByteCount += array.decode(is, false);
      return tlvByteCount;
    }

    if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.CONSTRUCTED, 2)) {
      structure = new Structure();
      tlvByteCount += structure.decode(is, false);
      return tlvByteCount;
    }

    if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.PRIMITIVE, 3)) {
      bool = new BerNull();
      tlvByteCount += bool.decode(is, false);
      return tlvByteCount;
    }

    if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.PRIMITIVE, 4)) {
      bitString = new Integer32();
      tlvByteCount += bitString.decode(is, false);
      return tlvByteCount;
    }

    if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.PRIMITIVE, 5)) {
      integer = new Unsigned8();
      tlvByteCount += integer.decode(is, false);
      return tlvByteCount;
    }

    if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.PRIMITIVE, 6)) {
      unsigned = new Unsigned8();
      tlvByteCount += unsigned.decode(is, false);
      return tlvByteCount;
    }

    if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.CONSTRUCTED, 7)) {
      floatingPoint = new FloatingPoint();
      tlvByteCount += floatingPoint.decode(is, false);
      return tlvByteCount;
    }

    if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.PRIMITIVE, 9)) {
      octetString = new Integer32();
      tlvByteCount += octetString.decode(is, false);
      return tlvByteCount;
    }

    if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.PRIMITIVE, 10)) {
      visibleString = new Integer32();
      tlvByteCount += visibleString.decode(is, false);
      return tlvByteCount;
    }

    if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.PRIMITIVE, 12)) {
      binaryTime = new BerBoolean();
      tlvByteCount += binaryTime.decode(is, false);
      return tlvByteCount;
    }

    if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.PRIMITIVE, 16)) {
      mMSString = new Integer32();
      tlvByteCount += mMSString.decode(is, false);
      return tlvByteCount;
    }

    if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.PRIMITIVE, 17)) {
      utcTime = new BerNull();
      tlvByteCount += utcTime.decode(is, false);
      return tlvByteCount;
    }

    if (tagWasPassed) {
      return 0;
    }

    throw new IOException("Error decoding CHOICE: Tag " + berTag + " matched to no item.");
  }

  public void encodeAndSave(int encodingSizeGuess) throws IOException {
    ReverseByteArrayOutputStream reverseOS = new ReverseByteArrayOutputStream(encodingSizeGuess);
    encode(reverseOS);
    code = reverseOS.getArray();
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    appendAsString(sb, 0);
    return sb.toString();
  }

  public void appendAsString(StringBuilder sb, int indentLevel) {

    if (array != null) {
      sb.append("array: ");
      array.appendAsString(sb, indentLevel + 1);
      return;
    }

    if (structure != null) {
      sb.append("structure: ");
      structure.appendAsString(sb, indentLevel + 1);
      return;
    }

    if (bool != null) {
      sb.append("bool: ").append(bool);
      return;
    }

    if (bitString != null) {
      sb.append("bitString: ").append(bitString);
      return;
    }

    if (integer != null) {
      sb.append("integer: ").append(integer);
      return;
    }

    if (unsigned != null) {
      sb.append("unsigned: ").append(unsigned);
      return;
    }

    if (floatingPoint != null) {
      sb.append("floatingPoint: ");
      floatingPoint.appendAsString(sb, indentLevel + 1);
      return;
    }

    if (octetString != null) {
      sb.append("octetString: ").append(octetString);
      return;
    }

    if (visibleString != null) {
      sb.append("visibleString: ").append(visibleString);
      return;
    }

    if (binaryTime != null) {
      sb.append("binaryTime: ").append(binaryTime);
      return;
    }

    if (mMSString != null) {
      sb.append("mMSString: ").append(mMSString);
      return;
    }

    if (utcTime != null) {
      sb.append("utcTime: ").append(utcTime);
      return;
    }

    sb.append("<none>");
  }

  public static class Array implements BerType, Serializable {

    public static final BerTag tag = new BerTag(BerTag.UNIVERSAL_CLASS, BerTag.CONSTRUCTED, 16);
    private static final long serialVersionUID = 1L;
    private byte[] code = null;
    private BerBoolean packed = null;
    private Unsigned32 numberOfElements = null;
    private TypeSpecification elementType = null;

    public Array() {}

    public Array(byte[] code) {
      this.code = code;
    }

    public BerBoolean getPacked() {
      return packed;
    }

    public void setPacked(BerBoolean packed) {
      this.packed = packed;
    }

    public Unsigned32 getNumberOfElements() {
      return numberOfElements;
    }

    public void setNumberOfElements(Unsigned32 numberOfElements) {
      this.numberOfElements = numberOfElements;
    }

    public TypeSpecification getElementType() {
      return elementType;
    }

    public void setElementType(TypeSpecification elementType) {
      this.elementType = elementType;
    }

    @Override
    public int encode(OutputStream reverseOS) throws IOException {
      return encode(reverseOS, true);
    }

    public int encode(OutputStream reverseOS, boolean withTag) throws IOException {

      if (code != null) {
        reverseOS.write(code);
        if (withTag) {
          return tag.encode(reverseOS) + code.length;
        }
        return code.length;
      }

      int codeLength = 0;
      int sublength;

      sublength = elementType.encode(reverseOS);
      codeLength += sublength;
      codeLength += BerLength.encodeLength(reverseOS, sublength);
      // write tag: CONTEXT_CLASS, CONSTRUCTED, 2
      reverseOS.write(0xA2);
      codeLength += 1;

      codeLength += numberOfElements.encode(reverseOS, false);
      // write tag: CONTEXT_CLASS, PRIMITIVE, 1
      reverseOS.write(0x81);
      codeLength += 1;

      if (packed != null) {
        codeLength += packed.encode(reverseOS, false);
        // write tag: CONTEXT_CLASS, PRIMITIVE, 0
        reverseOS.write(0x80);
        codeLength += 1;
      }

      codeLength += BerLength.encodeLength(reverseOS, codeLength);

      if (withTag) {
        codeLength += tag.encode(reverseOS);
      }

      return codeLength;
    }

    @Override
    public int decode(InputStream is) throws IOException {
      return decode(is, true);
    }

    public int decode(InputStream is, boolean withTag) throws IOException {
      int tlByteCount = 0;
      int vByteCount = 0;
      BerTag berTag = new BerTag();

      if (withTag) {
        tlByteCount += tag.decodeAndCheck(is);
      }

      BerLength length = new BerLength();
      tlByteCount += length.decode(is);
      int lengthVal = length.val;
      vByteCount += berTag.decode(is);

      if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.PRIMITIVE, 0)) {
        packed = new BerBoolean();
        vByteCount += packed.decode(is, false);
        vByteCount += berTag.decode(is);
      }

      if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.PRIMITIVE, 1)) {
        numberOfElements = new Unsigned32();
        vByteCount += numberOfElements.decode(is, false);
        vByteCount += berTag.decode(is);
      } else {
        throw new IOException("Tag does not match mandatory sequence component.");
      }

      if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.CONSTRUCTED, 2)) {
        vByteCount += length.decode(is);
        elementType = new TypeSpecification();
        vByteCount += elementType.decode(is, null);
        vByteCount += length.readEocIfIndefinite(is);
        if (lengthVal >= 0 && vByteCount == lengthVal) {
          return tlByteCount + vByteCount;
        }
        vByteCount += berTag.decode(is);
      } else {
        throw new IOException("Tag does not match mandatory sequence component.");
      }

      if (lengthVal < 0) {
        if (!berTag.equals(0, 0, 0)) {
          throw new IOException("Decoded sequence has wrong end of contents octets");
        }
        vByteCount += BerLength.readEocByte(is);
        return tlByteCount + vByteCount;
      }

      throw new IOException(
          "Unexpected end of sequence, length tag: "
              + lengthVal
              + ", bytes decoded: "
              + vByteCount);
    }

    public void encodeAndSave(int encodingSizeGuess) throws IOException {
      ReverseByteArrayOutputStream reverseOS = new ReverseByteArrayOutputStream(encodingSizeGuess);
      encode(reverseOS, false);
      code = reverseOS.getArray();
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      appendAsString(sb, 0);
      return sb.toString();
    }

    public void appendAsString(StringBuilder sb, int indentLevel) {

      sb.append("{");
      boolean firstSelectedElement = true;
      if (packed != null) {
        sb.append("\n");
        for (int i = 0; i < indentLevel + 1; i++) {
          sb.append("\t");
        }
        sb.append("packed: ").append(packed);
        firstSelectedElement = false;
      }

      if (!firstSelectedElement) {
        sb.append(",\n");
      }
      for (int i = 0; i < indentLevel + 1; i++) {
        sb.append("\t");
      }
      if (numberOfElements != null) {
        sb.append("numberOfElements: ").append(numberOfElements);
      } else {
        sb.append("numberOfElements: <empty-required-field>");
      }

      sb.append(",\n");
      for (int i = 0; i < indentLevel + 1; i++) {
        sb.append("\t");
      }
      if (elementType != null) {
        sb.append("elementType: ");
        elementType.appendAsString(sb, indentLevel + 1);
      } else {
        sb.append("elementType: <empty-required-field>");
      }

      sb.append("\n");
      for (int i = 0; i < indentLevel; i++) {
        sb.append("\t");
      }
      sb.append("}");
    }
  }

  public static class Structure implements BerType, Serializable {

    public static final BerTag tag = new BerTag(BerTag.UNIVERSAL_CLASS, BerTag.CONSTRUCTED, 16);
    private static final long serialVersionUID = 1L;
    private byte[] code = null;
    private BerBoolean packed = null;
    private Components components = null;
    public Structure() {}

    public Structure(byte[] code) {
      this.code = code;
    }

    public BerBoolean getPacked() {
      return packed;
    }

    public void setPacked(BerBoolean packed) {
      this.packed = packed;
    }

    public Components getComponents() {
      return components;
    }

    public void setComponents(Components components) {
      this.components = components;
    }

    @Override
    public int encode(OutputStream reverseOS) throws IOException {
      return encode(reverseOS, true);
    }

    public int encode(OutputStream reverseOS, boolean withTag) throws IOException {

      if (code != null) {
        reverseOS.write(code);
        if (withTag) {
          return tag.encode(reverseOS) + code.length;
        }
        return code.length;
      }

      int codeLength = 0;
      codeLength += components.encode(reverseOS, false);
      // write tag: CONTEXT_CLASS, CONSTRUCTED, 1
      reverseOS.write(0xA1);
      codeLength += 1;

      if (packed != null) {
        codeLength += packed.encode(reverseOS, false);
        // write tag: CONTEXT_CLASS, PRIMITIVE, 0
        reverseOS.write(0x80);
        codeLength += 1;
      }

      codeLength += BerLength.encodeLength(reverseOS, codeLength);

      if (withTag) {
        codeLength += tag.encode(reverseOS);
      }

      return codeLength;
    }

    @Override
    public int decode(InputStream is) throws IOException {
      return decode(is, true);
    }

    public int decode(InputStream is, boolean withTag) throws IOException {
      int tlByteCount = 0;
      int vByteCount = 0;
      BerTag berTag = new BerTag();

      if (withTag) {
        tlByteCount += tag.decodeAndCheck(is);
      }

      BerLength length = new BerLength();
      tlByteCount += length.decode(is);
      int lengthVal = length.val;
      vByteCount += berTag.decode(is);

      if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.PRIMITIVE, 0)) {
        packed = new BerBoolean();
        vByteCount += packed.decode(is, false);
        vByteCount += berTag.decode(is);
      }

      if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.CONSTRUCTED, 1)) {
        components = new Components();
        vByteCount += components.decode(is, false);
        if (lengthVal >= 0 && vByteCount == lengthVal) {
          return tlByteCount + vByteCount;
        }
        vByteCount += berTag.decode(is);
      } else {
        throw new IOException("Tag does not match mandatory sequence component.");
      }

      if (lengthVal < 0) {
        if (!berTag.equals(0, 0, 0)) {
          throw new IOException("Decoded sequence has wrong end of contents octets");
        }
        vByteCount += BerLength.readEocByte(is);
        return tlByteCount + vByteCount;
      }

      throw new IOException(
          "Unexpected end of sequence, length tag: "
              + lengthVal
              + ", bytes decoded: "
              + vByteCount);
    }

    public void encodeAndSave(int encodingSizeGuess) throws IOException {
      ReverseByteArrayOutputStream reverseOS = new ReverseByteArrayOutputStream(encodingSizeGuess);
      encode(reverseOS, false);
      code = reverseOS.getArray();
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      appendAsString(sb, 0);
      return sb.toString();
    }

    public void appendAsString(StringBuilder sb, int indentLevel) {

      sb.append("{");
      boolean firstSelectedElement = true;
      if (packed != null) {
        sb.append("\n");
        for (int i = 0; i < indentLevel + 1; i++) {
          sb.append("\t");
        }
        sb.append("packed: ").append(packed);
        firstSelectedElement = false;
      }

      if (!firstSelectedElement) {
        sb.append(",\n");
      }
      for (int i = 0; i < indentLevel + 1; i++) {
        sb.append("\t");
      }
      if (components != null) {
        sb.append("components: ");
        components.appendAsString(sb, indentLevel + 1);
      } else {
        sb.append("components: <empty-required-field>");
      }

      sb.append("\n");
      for (int i = 0; i < indentLevel; i++) {
        sb.append("\t");
      }
      sb.append("}");
    }

    public static class Components implements BerType, Serializable {

      public static final BerTag tag = new BerTag(BerTag.UNIVERSAL_CLASS, BerTag.CONSTRUCTED, 16);
      private static final long serialVersionUID = 1L;
      private byte[] code = null;
      private List<SEQUENCE> seqOf = null;
      public Components() {
        seqOf = new ArrayList<SEQUENCE>();
      }

      public Components(byte[] code) {
        this.code = code;
      }

      public List<SEQUENCE> getSEQUENCE() {
        if (seqOf == null) {
          seqOf = new ArrayList<SEQUENCE>();
        }
        return seqOf;
      }

      @Override
      public int encode(OutputStream reverseOS) throws IOException {
        return encode(reverseOS, true);
      }

      public int encode(OutputStream reverseOS, boolean withTag) throws IOException {

        if (code != null) {
          reverseOS.write(code);
          if (withTag) {
            return tag.encode(reverseOS) + code.length;
          }
          return code.length;
        }

        int codeLength = 0;
        for (int i = (seqOf.size() - 1); i >= 0; i--) {
          codeLength += seqOf.get(i).encode(reverseOS, true);
        }

        codeLength += BerLength.encodeLength(reverseOS, codeLength);

        if (withTag) {
          codeLength += tag.encode(reverseOS);
        }

        return codeLength;
      }

      @Override
      public int decode(InputStream is) throws IOException {
        return decode(is, true);
      }

      public int decode(InputStream is, boolean withTag) throws IOException {
        int tlByteCount = 0;
        int vByteCount = 0;
        BerTag berTag = new BerTag();
        if (withTag) {
          tlByteCount += tag.decodeAndCheck(is);
        }

        BerLength length = new BerLength();
        tlByteCount += length.decode(is);
        int lengthVal = length.val;

        while (vByteCount < lengthVal || lengthVal < 0) {
          vByteCount += berTag.decode(is);

          if (lengthVal < 0 && berTag.equals(0, 0, 0)) {
            vByteCount += BerLength.readEocByte(is);
            break;
          }

          if (!berTag.equals(SEQUENCE.tag)) {
            throw new IOException("Tag does not match mandatory sequence of/set of component.");
          }
          SEQUENCE element = new SEQUENCE();
          vByteCount += element.decode(is, false);
          seqOf.add(element);
        }
        if (lengthVal >= 0 && vByteCount != lengthVal) {
          throw new IOException(
              "Decoded SequenceOf or SetOf has wrong length. Expected "
                  + lengthVal
                  + " but has "
                  + vByteCount);
        }
        return tlByteCount + vByteCount;
      }

      public void encodeAndSave(int encodingSizeGuess) throws IOException {
        ReverseByteArrayOutputStream reverseOS =
            new ReverseByteArrayOutputStream(encodingSizeGuess);
        encode(reverseOS, false);
        code = reverseOS.getArray();
      }

      @Override
      public String toString() {
        StringBuilder sb = new StringBuilder();
        appendAsString(sb, 0);
        return sb.toString();
      }

      public void appendAsString(StringBuilder sb, int indentLevel) {

        sb.append("{\n");
        for (int i = 0; i < indentLevel + 1; i++) {
          sb.append("\t");
        }
        if (seqOf == null) {
          sb.append("null");
        } else {
          Iterator<SEQUENCE> it = seqOf.iterator();
          if (it.hasNext()) {
            it.next().appendAsString(sb, indentLevel + 1);
            while (it.hasNext()) {
              sb.append(",\n");
              for (int i = 0; i < indentLevel + 1; i++) {
                sb.append("\t");
              }
              it.next().appendAsString(sb, indentLevel + 1);
            }
          }
        }

        sb.append("\n");
        for (int i = 0; i < indentLevel; i++) {
          sb.append("\t");
        }
        sb.append("}");
      }

      public static class SEQUENCE implements BerType, Serializable {

        public static final BerTag tag = new BerTag(BerTag.UNIVERSAL_CLASS, BerTag.CONSTRUCTED, 16);
        private static final long serialVersionUID = 1L;
        private byte[] code = null;
        private Identifier componentName = null;
        private TypeSpecification componentType = null;

        public SEQUENCE() {}

        public SEQUENCE(byte[] code) {
          this.code = code;
        }

        public Identifier getComponentName() {
          return componentName;
        }

        public void setComponentName(Identifier componentName) {
          this.componentName = componentName;
        }

        public TypeSpecification getComponentType() {
          return componentType;
        }

        public void setComponentType(TypeSpecification componentType) {
          this.componentType = componentType;
        }

        @Override
        public int encode(OutputStream reverseOS) throws IOException {
          return encode(reverseOS, true);
        }

        public int encode(OutputStream reverseOS, boolean withTag) throws IOException {

          if (code != null) {
            reverseOS.write(code);
            if (withTag) {
              return tag.encode(reverseOS) + code.length;
            }
            return code.length;
          }

          int codeLength = 0;
          int sublength;

          sublength = componentType.encode(reverseOS);
          codeLength += sublength;
          codeLength += BerLength.encodeLength(reverseOS, sublength);
          // write tag: CONTEXT_CLASS, CONSTRUCTED, 1
          reverseOS.write(0xA1);
          codeLength += 1;

          if (componentName != null) {
            codeLength += componentName.encode(reverseOS, false);
            // write tag: CONTEXT_CLASS, PRIMITIVE, 0
            reverseOS.write(0x80);
            codeLength += 1;
          }

          codeLength += BerLength.encodeLength(reverseOS, codeLength);

          if (withTag) {
            codeLength += tag.encode(reverseOS);
          }

          return codeLength;
        }

        @Override
        public int decode(InputStream is) throws IOException {
          return decode(is, true);
        }

        public int decode(InputStream is, boolean withTag) throws IOException {
          int tlByteCount = 0;
          int vByteCount = 0;
          BerTag berTag = new BerTag();

          if (withTag) {
            tlByteCount += tag.decodeAndCheck(is);
          }

          BerLength length = new BerLength();
          tlByteCount += length.decode(is);
          int lengthVal = length.val;
          vByteCount += berTag.decode(is);

          if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.PRIMITIVE, 0)) {
            componentName = new Identifier();
            vByteCount += componentName.decode(is, false);
            vByteCount += berTag.decode(is);
          }

          if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.CONSTRUCTED, 1)) {
            vByteCount += length.decode(is);
            componentType = new TypeSpecification();
            vByteCount += componentType.decode(is, null);
            vByteCount += length.readEocIfIndefinite(is);
            if (lengthVal >= 0 && vByteCount == lengthVal) {
              return tlByteCount + vByteCount;
            }
            vByteCount += berTag.decode(is);
          } else {
            throw new IOException("Tag does not match mandatory sequence component.");
          }

          if (lengthVal < 0) {
            if (!berTag.equals(0, 0, 0)) {
              throw new IOException("Decoded sequence has wrong end of contents octets");
            }
            vByteCount += BerLength.readEocByte(is);
            return tlByteCount + vByteCount;
          }

          throw new IOException(
              "Unexpected end of sequence, length tag: "
                  + lengthVal
                  + ", bytes decoded: "
                  + vByteCount);
        }

        public void encodeAndSave(int encodingSizeGuess) throws IOException {
          ReverseByteArrayOutputStream reverseOS =
              new ReverseByteArrayOutputStream(encodingSizeGuess);
          encode(reverseOS, false);
          code = reverseOS.getArray();
        }

        @Override
        public String toString() {
          StringBuilder sb = new StringBuilder();
          appendAsString(sb, 0);
          return sb.toString();
        }

        public void appendAsString(StringBuilder sb, int indentLevel) {

          sb.append("{");
          boolean firstSelectedElement = true;
          if (componentName != null) {
            sb.append("\n");
            for (int i = 0; i < indentLevel + 1; i++) {
              sb.append("\t");
            }
            sb.append("componentName: ").append(componentName);
            firstSelectedElement = false;
          }

          if (!firstSelectedElement) {
            sb.append(",\n");
          }
          for (int i = 0; i < indentLevel + 1; i++) {
            sb.append("\t");
          }
          if (componentType != null) {
            sb.append("componentType: ");
            componentType.appendAsString(sb, indentLevel + 1);
          } else {
            sb.append("componentType: <empty-required-field>");
          }

          sb.append("\n");
          for (int i = 0; i < indentLevel; i++) {
            sb.append("\t");
          }
          sb.append("}");
        }
      }
    }
  }

  public static class FloatingPoint implements BerType, Serializable {

    public static final BerTag tag = new BerTag(BerTag.UNIVERSAL_CLASS, BerTag.CONSTRUCTED, 16);
    private static final long serialVersionUID = 1L;
    private byte[] code = null;
    private Unsigned8 formatWidth = null;
    private Unsigned8 exponentWidth = null;

    public FloatingPoint() {}

    public FloatingPoint(byte[] code) {
      this.code = code;
    }

    public Unsigned8 getFormatWidth() {
      return formatWidth;
    }

    public void setFormatWidth(Unsigned8 formatWidth) {
      this.formatWidth = formatWidth;
    }

    public Unsigned8 getExponentWidth() {
      return exponentWidth;
    }

    public void setExponentWidth(Unsigned8 exponentWidth) {
      this.exponentWidth = exponentWidth;
    }

    @Override
    public int encode(OutputStream reverseOS) throws IOException {
      return encode(reverseOS, true);
    }

    public int encode(OutputStream reverseOS, boolean withTag) throws IOException {

      if (code != null) {
        reverseOS.write(code);
        if (withTag) {
          return tag.encode(reverseOS) + code.length;
        }
        return code.length;
      }

      int codeLength = 0;
      codeLength += exponentWidth.encode(reverseOS, true);

      codeLength += formatWidth.encode(reverseOS, true);

      codeLength += BerLength.encodeLength(reverseOS, codeLength);

      if (withTag) {
        codeLength += tag.encode(reverseOS);
      }

      return codeLength;
    }

    @Override
    public int decode(InputStream is) throws IOException {
      return decode(is, true);
    }

    public int decode(InputStream is, boolean withTag) throws IOException {
      int tlByteCount = 0;
      int vByteCount = 0;
      BerTag berTag = new BerTag();

      if (withTag) {
        tlByteCount += tag.decodeAndCheck(is);
      }

      BerLength length = new BerLength();
      tlByteCount += length.decode(is);
      int lengthVal = length.val;
      vByteCount += berTag.decode(is);

      if (berTag.equals(Unsigned8.tag)) {
        formatWidth = new Unsigned8();
        vByteCount += formatWidth.decode(is, false);
        vByteCount += berTag.decode(is);
      } else {
        throw new IOException("Tag does not match mandatory sequence component.");
      }

      if (berTag.equals(Unsigned8.tag)) {
        exponentWidth = new Unsigned8();
        vByteCount += exponentWidth.decode(is, false);
        if (lengthVal >= 0 && vByteCount == lengthVal) {
          return tlByteCount + vByteCount;
        }
        vByteCount += berTag.decode(is);
      } else {
        throw new IOException("Tag does not match mandatory sequence component.");
      }

      if (lengthVal < 0) {
        if (!berTag.equals(0, 0, 0)) {
          throw new IOException("Decoded sequence has wrong end of contents octets");
        }
        vByteCount += BerLength.readEocByte(is);
        return tlByteCount + vByteCount;
      }

      throw new IOException(
          "Unexpected end of sequence, length tag: "
              + lengthVal
              + ", bytes decoded: "
              + vByteCount);
    }

    public void encodeAndSave(int encodingSizeGuess) throws IOException {
      ReverseByteArrayOutputStream reverseOS = new ReverseByteArrayOutputStream(encodingSizeGuess);
      encode(reverseOS, false);
      code = reverseOS.getArray();
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      appendAsString(sb, 0);
      return sb.toString();
    }

    public void appendAsString(StringBuilder sb, int indentLevel) {

      sb.append("{");
      sb.append("\n");
      for (int i = 0; i < indentLevel + 1; i++) {
        sb.append("\t");
      }
      if (formatWidth != null) {
        sb.append("formatWidth: ").append(formatWidth);
      } else {
        sb.append("formatWidth: <empty-required-field>");
      }

      sb.append(",\n");
      for (int i = 0; i < indentLevel + 1; i++) {
        sb.append("\t");
      }
      if (exponentWidth != null) {
        sb.append("exponentWidth: ").append(exponentWidth);
      } else {
        sb.append("exponentWidth: <empty-required-field>");
      }

      sb.append("\n");
      for (int i = 0; i < indentLevel; i++) {
        sb.append("\t");
      }
      sb.append("}");
    }
  }
}
