/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.7
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package edu.upc.freeling;

public class Word extends ListAnalysis {
  private long swigCPtr;

  protected Word(long cPtr, boolean cMemoryOwn) {
    super(freelingJNI.Word_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(Word obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        freelingJNI.delete_Word(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public void setUser(VectorString value) {
    freelingJNI.Word_user_set(swigCPtr, this, VectorString.getCPtr(value), value);
  }

  public VectorString getUser() {
    long cPtr = freelingJNI.Word_user_get(swigCPtr, this);
    return (cPtr == 0) ? null : new VectorString(cPtr, false);
  }

  public Word() {
    this(freelingJNI.new_Word__SWIG_0(), true);
  }

  public Word(String arg0) {
    this(freelingJNI.new_Word__SWIG_1(arg0), true);
  }

  public Word(String arg0, ListWord arg1) {
    this(freelingJNI.new_Word__SWIG_2(arg0, ListWord.getCPtr(arg1), arg1), true);
  }

  public Word(String arg0, ListAnalysis arg1, ListWord arg2) {
    this(freelingJNI.new_Word__SWIG_3(arg0, ListAnalysis.getCPtr(arg1), arg1, ListWord.getCPtr(arg2), arg2), true);
  }

  public Word(Word arg0) {
    this(freelingJNI.new_Word__SWIG_4(Word.getCPtr(arg0), arg0), true);
  }

  public Word operator_assignment(Word arg0) {
    return new Word(freelingJNI.Word_operator_assignment(swigCPtr, this, Word.getCPtr(arg0), arg0), false);
  }

  public void copyAnalysis(Word arg0) {
    freelingJNI.Word_copyAnalysis(swigCPtr, this, Word.getCPtr(arg0), arg0);
  }

  public int getNSelected() {
    return freelingJNI.Word_getNSelected(swigCPtr, this);
  }

  public int getNUnselected() {
    return freelingJNI.Word_getNUnselected(swigCPtr, this);
  }

  public boolean isMultiword() {
    return freelingJNI.Word_isMultiword(swigCPtr, this);
  }

  public int getNWordsMw() {
    return freelingJNI.Word_getNWordsMw(swigCPtr, this);
  }

  public ListWord getWordsMw() {
    return new ListWord(freelingJNI.Word_getWordsMw(swigCPtr, this), true);
  }

  public String getForm() {
    return freelingJNI.Word_getForm(swigCPtr, this);
  }

  public String getLcForm() {
    return freelingJNI.Word_getLcForm(swigCPtr, this);
  }

  public SWIGTYPE_p_word__iterator selectedBegin(int k) {
    return new SWIGTYPE_p_word__iterator(freelingJNI.Word_selectedBegin__SWIG_0(swigCPtr, this, k), true);
  }

  public SWIGTYPE_p_word__iterator selectedBegin() {
    return new SWIGTYPE_p_word__iterator(freelingJNI.Word_selectedBegin__SWIG_1(swigCPtr, this), true);
  }

  public SWIGTYPE_p_word__iterator selectedEnd(int k) {
    return new SWIGTYPE_p_word__iterator(freelingJNI.Word_selectedEnd__SWIG_0(swigCPtr, this, k), true);
  }

  public SWIGTYPE_p_word__iterator selectedEnd() {
    return new SWIGTYPE_p_word__iterator(freelingJNI.Word_selectedEnd__SWIG_1(swigCPtr, this), true);
  }

  public SWIGTYPE_p_word__iterator unselectedBegin(int k) {
    return new SWIGTYPE_p_word__iterator(freelingJNI.Word_unselectedBegin__SWIG_0(swigCPtr, this, k), true);
  }

  public SWIGTYPE_p_word__iterator unselectedBegin() {
    return new SWIGTYPE_p_word__iterator(freelingJNI.Word_unselectedBegin__SWIG_1(swigCPtr, this), true);
  }

  public SWIGTYPE_p_word__iterator unselectedEnd(int k) {
    return new SWIGTYPE_p_word__iterator(freelingJNI.Word_unselectedEnd__SWIG_0(swigCPtr, this, k), true);
  }

  public SWIGTYPE_p_word__iterator unselectedEnd() {
    return new SWIGTYPE_p_word__iterator(freelingJNI.Word_unselectedEnd__SWIG_1(swigCPtr, this), true);
  }

  public String getLemma(int k) {
    return freelingJNI.Word_getLemma__SWIG_0(swigCPtr, this, k);
  }

  public String getLemma() {
    return freelingJNI.Word_getLemma__SWIG_1(swigCPtr, this);
  }

  public String getTag(int k) {
    return freelingJNI.Word_getTag__SWIG_0(swigCPtr, this, k);
  }

  public String getTag() {
    return freelingJNI.Word_getTag__SWIG_1(swigCPtr, this);
  }

  public String getShortTag(int k) {
    return freelingJNI.Word_getShortTag__SWIG_0(swigCPtr, this, k);
  }

  public String getShortTag() {
    return freelingJNI.Word_getShortTag__SWIG_1(swigCPtr, this);
  }

  public String getShortTag(String arg0, int k) {
    return freelingJNI.Word_getShortTag__SWIG_2(swigCPtr, this, arg0, k);
  }

  public String getShortTag(String arg0) {
    return freelingJNI.Word_getShortTag__SWIG_3(swigCPtr, this, arg0);
  }

  public SWIGTYPE_p_std__listT_std__pairT_std__wstring_double_t_t getSenses(int k) {
    return new SWIGTYPE_p_std__listT_std__pairT_std__wstring_double_t_t(freelingJNI.Word_getSenses__SWIG_0(swigCPtr, this, k), true);
  }

  public SWIGTYPE_p_std__listT_std__pairT_std__wstring_double_t_t getSenses() {
    return new SWIGTYPE_p_std__listT_std__pairT_std__wstring_double_t_t(freelingJNI.Word_getSenses__SWIG_1(swigCPtr, this), true);
  }

  public String getSensesString(int k) {
    return freelingJNI.Word_getSensesString__SWIG_0(swigCPtr, this, k);
  }

  public String getSensesString() {
    return freelingJNI.Word_getSensesString__SWIG_1(swigCPtr, this);
  }

  public void setSenses(SWIGTYPE_p_std__listT_std__pairT_std__wstring_double_t_t arg0, int k) {
    freelingJNI.Word_setSenses__SWIG_0(swigCPtr, this, SWIGTYPE_p_std__listT_std__pairT_std__wstring_double_t_t.getCPtr(arg0), k);
  }

  public void setSenses(SWIGTYPE_p_std__listT_std__pairT_std__wstring_double_t_t arg0) {
    freelingJNI.Word_setSenses__SWIG_1(swigCPtr, this, SWIGTYPE_p_std__listT_std__pairT_std__wstring_double_t_t.getCPtr(arg0));
  }

  public long getSpanStart() {
    return freelingJNI.Word_getSpanStart(swigCPtr, this);
  }

  public long getSpanFinish() {
    return freelingJNI.Word_getSpanFinish(swigCPtr, this);
  }

  public boolean foundInDict() {
    return freelingJNI.Word_foundInDict(swigCPtr, this);
  }

  public void setFoundInDict(boolean arg0) {
    freelingJNI.Word_setFoundInDict(swigCPtr, this, arg0);
  }

  public boolean hasRetokenizable() {
    return freelingJNI.Word_hasRetokenizable(swigCPtr, this);
  }

  public void lockAnalysis() {
    freelingJNI.Word_lockAnalysis(swigCPtr, this);
  }

  public boolean isLocked() {
    return freelingJNI.Word_isLocked(swigCPtr, this);
  }

  public void addAlternative(Word arg0, double arg1) {
    freelingJNI.Word_addAlternative(swigCPtr, this, Word.getCPtr(arg0), arg0, arg1);
  }

  public void setAlternatives(SWIGTYPE_p_std__listT_std__pairT_word_double_t_t arg0) {
    freelingJNI.Word_setAlternatives(swigCPtr, this, SWIGTYPE_p_std__listT_std__pairT_word_double_t_t.getCPtr(arg0));
  }

  public boolean hasAlternatives() {
    return freelingJNI.Word_hasAlternatives(swigCPtr, this);
  }

  public SWIGTYPE_p_std__listT_std__pairT_word_double_t_t getAlternatives() {
    return new SWIGTYPE_p_std__listT_std__pairT_word_double_t_t(freelingJNI.Word_getAlternatives(swigCPtr, this), true);
  }

  public SWIGTYPE_p_std__listT_std__pairT_word_double_t_t__iterator alternativesBegin() {
    return new SWIGTYPE_p_std__listT_std__pairT_word_double_t_t__iterator(freelingJNI.Word_alternativesBegin(swigCPtr, this), true);
  }

  public SWIGTYPE_p_std__listT_std__pairT_word_double_t_t__iterator alternativesEnd() {
    return new SWIGTYPE_p_std__listT_std__pairT_word_double_t_t__iterator(freelingJNI.Word_alternativesEnd(swigCPtr, this), true);
  }

  public void addAnalysis(Analysis arg0) {
    freelingJNI.Word_addAnalysis(swigCPtr, this, Analysis.getCPtr(arg0), arg0);
  }

  public void setAnalysis(Analysis arg0) {
    freelingJNI.Word_setAnalysis__SWIG_0(swigCPtr, this, Analysis.getCPtr(arg0), arg0);
  }

  public void setAnalysis(ListAnalysis arg0) {
    freelingJNI.Word_setAnalysis__SWIG_1(swigCPtr, this, ListAnalysis.getCPtr(arg0), arg0);
  }

  public void setForm(String arg0) {
    freelingJNI.Word_setForm(swigCPtr, this, arg0);
  }

  public void setSpan(long arg0, long arg1) {
    freelingJNI.Word_setSpan(swigCPtr, this, arg0, arg1);
  }

  public boolean findTagMatch(SWIGTYPE_p_boost__u32regex arg0) {
    return freelingJNI.Word_findTagMatch(swigCPtr, this, SWIGTYPE_p_boost__u32regex.getCPtr(arg0));
  }

  public int getNAnalysis() {
    return freelingJNI.Word_getNAnalysis(swigCPtr, this);
  }

  public void unselectAllAnalysis(int k) {
    freelingJNI.Word_unselectAllAnalysis__SWIG_0(swigCPtr, this, k);
  }

  public void unselectAllAnalysis() {
    freelingJNI.Word_unselectAllAnalysis__SWIG_1(swigCPtr, this);
  }

  public void selectAllAnalysis(int k) {
    freelingJNI.Word_selectAllAnalysis__SWIG_0(swigCPtr, this, k);
  }

  public void selectAllAnalysis() {
    freelingJNI.Word_selectAllAnalysis__SWIG_1(swigCPtr, this);
  }

  public void selectAnalysis(SWIGTYPE_p_word__iterator arg0, int k) {
    freelingJNI.Word_selectAnalysis__SWIG_0(swigCPtr, this, SWIGTYPE_p_word__iterator.getCPtr(arg0), k);
  }

  public void selectAnalysis(SWIGTYPE_p_word__iterator arg0) {
    freelingJNI.Word_selectAnalysis__SWIG_1(swigCPtr, this, SWIGTYPE_p_word__iterator.getCPtr(arg0));
  }

  public void unselectAnalysis(SWIGTYPE_p_word__iterator arg0, int k) {
    freelingJNI.Word_unselectAnalysis__SWIG_0(swigCPtr, this, SWIGTYPE_p_word__iterator.getCPtr(arg0), k);
  }

  public void unselectAnalysis(SWIGTYPE_p_word__iterator arg0) {
    freelingJNI.Word_unselectAnalysis__SWIG_1(swigCPtr, this, SWIGTYPE_p_word__iterator.getCPtr(arg0));
  }

  public ListAnalysis getAnalysis() {
    return new ListAnalysis(freelingJNI.Word_getAnalysis(swigCPtr, this), true);
  }

  public SWIGTYPE_p_word__iterator analysisBegin() {
    return new SWIGTYPE_p_word__iterator(freelingJNI.Word_analysisBegin(swigCPtr, this), true);
  }

  public SWIGTYPE_p_word__iterator analysisEnd() {
    return new SWIGTYPE_p_word__iterator(freelingJNI.Word_analysisEnd(swigCPtr, this), true);
  }

}
