/** This class file was automatically generated by ASN1bean (http://www.beanit.com) */
package com.beanit.openiec61850.internal.mms.asn1;

import com.beanit.asn1bean.ber.BerLength;
import com.beanit.asn1bean.ber.BerTag;
import com.beanit.asn1bean.ber.ReverseByteArrayOutputStream;
import com.beanit.asn1bean.ber.types.BerType;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Serializable;

public class DeleteNamedVariableListResponse implements BerType, Serializable {

  public static final BerTag tag = new BerTag(BerTag.UNIVERSAL_CLASS, BerTag.CONSTRUCTED, 16);
  private static final long serialVersionUID = 1L;
  private byte[] code = null;
  private Unsigned32 numberMatched = null;
  private Unsigned32 numberDeleted = null;

  public DeleteNamedVariableListResponse() {}

  public DeleteNamedVariableListResponse(byte[] code) {
    this.code = code;
  }

  public Unsigned32 getNumberMatched() {
    return numberMatched;
  }

  public void setNumberMatched(Unsigned32 numberMatched) {
    this.numberMatched = numberMatched;
  }

  public Unsigned32 getNumberDeleted() {
    return numberDeleted;
  }

  public void setNumberDeleted(Unsigned32 numberDeleted) {
    this.numberDeleted = numberDeleted;
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
    codeLength += numberDeleted.encode(reverseOS, false);
    // write tag: CONTEXT_CLASS, PRIMITIVE, 1
    reverseOS.write(0x81);
    codeLength += 1;

    codeLength += numberMatched.encode(reverseOS, false);
    // write tag: CONTEXT_CLASS, PRIMITIVE, 0
    reverseOS.write(0x80);
    codeLength += 1;

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
      numberMatched = new Unsigned32();
      vByteCount += numberMatched.decode(is, false);
      vByteCount += berTag.decode(is);
    } else {
      throw new IOException("Tag does not match mandatory sequence component.");
    }

    if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.PRIMITIVE, 1)) {
      numberDeleted = new Unsigned32();
      vByteCount += numberDeleted.decode(is, false);
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
        "Unexpected end of sequence, length tag: " + lengthVal + ", bytes decoded: " + vByteCount);
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
    if (numberMatched != null) {
      sb.append("numberMatched: ").append(numberMatched);
    } else {
      sb.append("numberMatched: <empty-required-field>");
    }

    sb.append(",\n");
    for (int i = 0; i < indentLevel + 1; i++) {
      sb.append("\t");
    }
    if (numberDeleted != null) {
      sb.append("numberDeleted: ").append(numberDeleted);
    } else {
      sb.append("numberDeleted: <empty-required-field>");
    }

    sb.append("\n");
    for (int i = 0; i < indentLevel; i++) {
      sb.append("\t");
    }
    sb.append("}");
  }
}
