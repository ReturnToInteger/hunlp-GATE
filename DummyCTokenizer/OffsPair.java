/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.5
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */


public class OffsPair {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected OffsPair(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(OffsPair obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        DummyCTokenizerJNI.delete_OffsPair(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setStart(int value) {
    DummyCTokenizerJNI.OffsPair_start_set(swigCPtr, this, value);
  }

  public int getStart() {
    return DummyCTokenizerJNI.OffsPair_start_get(swigCPtr, this);
  }

  public void setEnd(int value) {
    DummyCTokenizerJNI.OffsPair_end_set(swigCPtr, this, value);
  }

  public int getEnd() {
    return DummyCTokenizerJNI.OffsPair_end_get(swigCPtr, this);
  }

  public OffsPair() {
    this(DummyCTokenizerJNI.new_OffsPair(), true);
  }

}
