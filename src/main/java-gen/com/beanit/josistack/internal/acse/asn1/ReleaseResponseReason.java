/*
 * This class file was automatically generated by ASN1bean (http://www.beanit.com)
 */

package com.beanit.josistack.internal.acse.asn1;

import com.beanit.asn1bean.ber.types.BerInteger;
import java.math.BigInteger;

public class ReleaseResponseReason extends BerInteger {

  private static final long serialVersionUID = 1L;

  public ReleaseResponseReason() {}

  public ReleaseResponseReason(byte[] code) {
    super(code);
  }

  public ReleaseResponseReason(BigInteger value) {
    super(value);
  }

  public ReleaseResponseReason(long value) {
    super(value);
  }
}
