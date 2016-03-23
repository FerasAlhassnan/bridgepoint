/**
 * generated by Xtext 2.9.1
 */
package org.xtuml.bp.ui.xtext.myDsl.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtuml.bp.ui.xtext.myDsl.MyDslPackage;
import org.xtuml.bp.ui.xtext.myDsl.codeBlockStatement;
import org.xtuml.bp.ui.xtext.myDsl.exceptionHandler;
import org.xtuml.bp.ui.xtext.myDsl.otherHandler;
import org.xtuml.bp.ui.xtext.myDsl.statementList;
import org.xtuml.bp.ui.xtext.myDsl.variableDeclaration;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>code Block Statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtuml.bp.ui.xtext.myDsl.impl.codeBlockStatementImpl#getV <em>V</em>}</li>
 *   <li>{@link org.xtuml.bp.ui.xtext.myDsl.impl.codeBlockStatementImpl#getS <em>S</em>}</li>
 *   <li>{@link org.xtuml.bp.ui.xtext.myDsl.impl.codeBlockStatementImpl#getE <em>E</em>}</li>
 *   <li>{@link org.xtuml.bp.ui.xtext.myDsl.impl.codeBlockStatementImpl#getP <em>P</em>}</li>
 * </ul>
 *
 * @generated
 */
public class codeBlockStatementImpl extends MinimalEObjectImpl.Container implements codeBlockStatement
{
  /**
   * The cached value of the '{@link #getV() <em>V</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getV()
   * @generated
   * @ordered
   */
  protected EList<variableDeclaration> v;

  /**
   * The cached value of the '{@link #getS() <em>S</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getS()
   * @generated
   * @ordered
   */
  protected statementList s;

  /**
   * The cached value of the '{@link #getE() <em>E</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getE()
   * @generated
   * @ordered
   */
  protected EList<exceptionHandler> e;

  /**
   * The cached value of the '{@link #getP() <em>P</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getP()
   * @generated
   * @ordered
   */
  protected otherHandler p;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected codeBlockStatementImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return MyDslPackage.Literals.CODE_BLOCK_STATEMENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<variableDeclaration> getV()
  {
    if (v == null)
    {
      v = new EObjectContainmentEList<variableDeclaration>(variableDeclaration.class, this, MyDslPackage.CODE_BLOCK_STATEMENT__V);
    }
    return v;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public statementList getS()
  {
    return s;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetS(statementList newS, NotificationChain msgs)
  {
    statementList oldS = s;
    s = newS;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.CODE_BLOCK_STATEMENT__S, oldS, newS);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setS(statementList newS)
  {
    if (newS != s)
    {
      NotificationChain msgs = null;
      if (s != null)
        msgs = ((InternalEObject)s).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.CODE_BLOCK_STATEMENT__S, null, msgs);
      if (newS != null)
        msgs = ((InternalEObject)newS).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.CODE_BLOCK_STATEMENT__S, null, msgs);
      msgs = basicSetS(newS, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.CODE_BLOCK_STATEMENT__S, newS, newS));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<exceptionHandler> getE()
  {
    if (e == null)
    {
      e = new EObjectContainmentEList<exceptionHandler>(exceptionHandler.class, this, MyDslPackage.CODE_BLOCK_STATEMENT__E);
    }
    return e;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public otherHandler getP()
  {
    return p;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetP(otherHandler newP, NotificationChain msgs)
  {
    otherHandler oldP = p;
    p = newP;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.CODE_BLOCK_STATEMENT__P, oldP, newP);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setP(otherHandler newP)
  {
    if (newP != p)
    {
      NotificationChain msgs = null;
      if (p != null)
        msgs = ((InternalEObject)p).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.CODE_BLOCK_STATEMENT__P, null, msgs);
      if (newP != null)
        msgs = ((InternalEObject)newP).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.CODE_BLOCK_STATEMENT__P, null, msgs);
      msgs = basicSetP(newP, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.CODE_BLOCK_STATEMENT__P, newP, newP));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case MyDslPackage.CODE_BLOCK_STATEMENT__V:
        return ((InternalEList<?>)getV()).basicRemove(otherEnd, msgs);
      case MyDslPackage.CODE_BLOCK_STATEMENT__S:
        return basicSetS(null, msgs);
      case MyDslPackage.CODE_BLOCK_STATEMENT__E:
        return ((InternalEList<?>)getE()).basicRemove(otherEnd, msgs);
      case MyDslPackage.CODE_BLOCK_STATEMENT__P:
        return basicSetP(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case MyDslPackage.CODE_BLOCK_STATEMENT__V:
        return getV();
      case MyDslPackage.CODE_BLOCK_STATEMENT__S:
        return getS();
      case MyDslPackage.CODE_BLOCK_STATEMENT__E:
        return getE();
      case MyDslPackage.CODE_BLOCK_STATEMENT__P:
        return getP();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case MyDslPackage.CODE_BLOCK_STATEMENT__V:
        getV().clear();
        getV().addAll((Collection<? extends variableDeclaration>)newValue);
        return;
      case MyDslPackage.CODE_BLOCK_STATEMENT__S:
        setS((statementList)newValue);
        return;
      case MyDslPackage.CODE_BLOCK_STATEMENT__E:
        getE().clear();
        getE().addAll((Collection<? extends exceptionHandler>)newValue);
        return;
      case MyDslPackage.CODE_BLOCK_STATEMENT__P:
        setP((otherHandler)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case MyDslPackage.CODE_BLOCK_STATEMENT__V:
        getV().clear();
        return;
      case MyDslPackage.CODE_BLOCK_STATEMENT__S:
        setS((statementList)null);
        return;
      case MyDslPackage.CODE_BLOCK_STATEMENT__E:
        getE().clear();
        return;
      case MyDslPackage.CODE_BLOCK_STATEMENT__P:
        setP((otherHandler)null);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case MyDslPackage.CODE_BLOCK_STATEMENT__V:
        return v != null && !v.isEmpty();
      case MyDslPackage.CODE_BLOCK_STATEMENT__S:
        return s != null;
      case MyDslPackage.CODE_BLOCK_STATEMENT__E:
        return e != null && !e.isEmpty();
      case MyDslPackage.CODE_BLOCK_STATEMENT__P:
        return p != null;
    }
    return super.eIsSet(featureID);
  }

} //codeBlockStatementImpl