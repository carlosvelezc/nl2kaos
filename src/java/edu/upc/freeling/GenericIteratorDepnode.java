/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.7
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package edu.upc.freeling;

public class GenericIteratorDepnode extends TreeIteratorDepnode {
  private long swigCPtr;

  protected GenericIteratorDepnode(long cPtr, boolean cMemoryOwn) {
    super(freelingJNI.GenericIteratorDepnode_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(GenericIteratorDepnode obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        freelingJNI.delete_GenericIteratorDepnode(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public GenericIteratorDepnode() {
    this(freelingJNI.new_GenericIteratorDepnode__SWIG_0(), true);
  }

  public GenericIteratorDepnode(TreeDepnode arg0) {
    this(freelingJNI.new_GenericIteratorDepnode__SWIG_1(TreeDepnode.getCPtr(arg0), arg0), true);
  }

  public GenericIteratorDepnode(GenericIteratorDepnode arg0) {
    this(freelingJNI.new_GenericIteratorDepnode__SWIG_2(GenericIteratorDepnode.getCPtr(arg0), arg0), true);
  }

  public TreeDepnode __ref__() {
    return new TreeDepnode(freelingJNI.GenericIteratorDepnode___ref__(swigCPtr, this), false);
  }

  public TreeDepnode __deref__() {
    long cPtr = freelingJNI.GenericIteratorDepnode___deref__(swigCPtr, this);
    return (cPtr == 0) ? null : new TreeDepnode(cPtr, false);
  }

  public void setInfo(Depnode value) {
    freelingJNI.GenericIteratorDepnode_info_set(swigCPtr, this, Depnode.getCPtr(value), value);
  }

  public Depnode getInfo() {
    long cPtr = freelingJNI.GenericIteratorDepnode_info_get(swigCPtr, this);
    return (cPtr == 0) ? null : new Depnode(cPtr, false);
  }

  public TreeDepnode operator_assignment(TreeDepnode arg0) {
    return new TreeDepnode(freelingJNI.GenericIteratorDepnode_operator_assignment(swigCPtr, this, TreeDepnode.getCPtr(arg0), arg0), false);
  }

  public long numChildren() {
    return freelingJNI.GenericIteratorDepnode_numChildren(swigCPtr, this);
  }

  public SiblingIteratorDepnode nthChild(long arg0) {
    return new SiblingIteratorDepnode(freelingJNI.GenericIteratorDepnode_nthChild(swigCPtr, this, arg0), true);
  }

  public PreorderIteratorDepnode getParent() {
    return new PreorderIteratorDepnode(freelingJNI.GenericIteratorDepnode_getParent(swigCPtr, this), true);
  }

  public TreeDepnode nthChildRef(long arg0) {
    return new TreeDepnode(freelingJNI.GenericIteratorDepnode_nthChildRef(swigCPtr, this, arg0), false);
  }

  public Depnode getInformation() {
    return new Depnode(freelingJNI.GenericIteratorDepnode_getInformation(swigCPtr, this), false);
  }

  public void appendChild(TreeDepnode arg0) {
    freelingJNI.GenericIteratorDepnode_appendChild(swigCPtr, this, TreeDepnode.getCPtr(arg0), arg0);
  }

  public void hangChild(TreeDepnode arg0, boolean arg1) {
    freelingJNI.GenericIteratorDepnode_hangChild__SWIG_0(swigCPtr, this, TreeDepnode.getCPtr(arg0), arg0, arg1);
  }

  public void hangChild(TreeDepnode arg0) {
    freelingJNI.GenericIteratorDepnode_hangChild__SWIG_1(swigCPtr, this, TreeDepnode.getCPtr(arg0), arg0);
  }

  public void clear() {
    freelingJNI.GenericIteratorDepnode_clear(swigCPtr, this);
  }

  public boolean empty() {
    return freelingJNI.GenericIteratorDepnode_empty(swigCPtr, this);
  }

  public SiblingIteratorDepnode siblingBegin() {
    return new SiblingIteratorDepnode(freelingJNI.GenericIteratorDepnode_siblingBegin(swigCPtr, this), true);
  }

  public SiblingIteratorDepnode siblingEnd() {
    return new SiblingIteratorDepnode(freelingJNI.GenericIteratorDepnode_siblingEnd(swigCPtr, this), true);
  }

  public SiblingIteratorDepnode siblingRbegin() {
    return new SiblingIteratorDepnode(freelingJNI.GenericIteratorDepnode_siblingRbegin(swigCPtr, this), true);
  }

  public SiblingIteratorDepnode siblingRend() {
    return new SiblingIteratorDepnode(freelingJNI.GenericIteratorDepnode_siblingRend(swigCPtr, this), true);
  }

  public PreorderIteratorDepnode begin() {
    return new PreorderIteratorDepnode(freelingJNI.GenericIteratorDepnode_begin(swigCPtr, this), true);
  }

  public PreorderIteratorDepnode end() {
    return new PreorderIteratorDepnode(freelingJNI.GenericIteratorDepnode_end(swigCPtr, this), true);
  }

}
