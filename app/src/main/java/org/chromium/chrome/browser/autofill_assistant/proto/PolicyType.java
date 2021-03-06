// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: service.proto

package org.chromium.chrome.browser.autofill_assistant.proto;

/**
 * Protobuf enum {@code autofill_assistant.PolicyType}
 */
public enum PolicyType
    implements com.google.protobuf.Internal.EnumLite {
  /**
   * <code>UNKNOWN_POLICY = 0;</code>
   */
  UNKNOWN_POLICY(0),
  /**
   * <code>SCRIPT = 1;</code>
   */
  SCRIPT(1),
  ;

  /**
   * <code>UNKNOWN_POLICY = 0;</code>
   */
  public static final int UNKNOWN_POLICY_VALUE = 0;
  /**
   * <code>SCRIPT = 1;</code>
   */
  public static final int SCRIPT_VALUE = 1;


  public final int getNumber() {
    return value;
  }

  /**
   * @deprecated Use {@link #forNumber(int)} instead.
   */
  @java.lang.Deprecated
  public static PolicyType valueOf(int value) {
    return forNumber(value);
  }

  public static PolicyType forNumber(int value) {
    switch (value) {
      case 0: return UNKNOWN_POLICY;
      case 1: return SCRIPT;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<PolicyType>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      PolicyType> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<PolicyType>() {
          public PolicyType findValueByNumber(int number) {
            return PolicyType.forNumber(number);
          }
        };

  private final int value;

  private PolicyType(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:autofill_assistant.PolicyType)
}

