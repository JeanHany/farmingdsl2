/*******************************************************************************
 * Copyright (c) 2012 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.eclipse.xtext.xbase.lib;

/**
 * This is an extension library for {@link Double} numbers.
 * 
 * @author Jan Koehnlein - Code generator
 * @since 2.3
 */
public class DoubleExtensions {
	// BEGIN generated code
	/**
	 * The unary <code>minus</code> operator. This is the equivalent to the Java's <code>-</code> function.
	 * 
	 * @param d  a double.
	 * @return   <code>-d</code>
	 * @since 2.3
	 */
	@Pure
	@Inline(value="(-$1)", constantExpression=true)
	public static double operator_minus(double d) {
		return -d;
	}
	
	/**
	 * The postfix <code>decrement</code> operator. This is the equivalent to the Java's <code>--</code> postfix function.
	 * 
	 * @param d  a double.
	 * @return   <code>d--</code>
	 * @since 2.6
	 */
	@Inline(value="$1--")
	public static double operator_minusMinus(double d) {
		throw new HardcodedInInterpreterException();
	}
	
	/**
	 * The postfix <code>decrement</code> operator. This is the equivalent to the Java's <code>--</code> postfix function.
	 * 
	 * @param d  a double.
	 * @return   <code>d--</code>
	 * @since 2.6
	 */
	@Inline(value="$1--")
	public static Double operator_minusMinus(Double d) {
		throw new HardcodedInInterpreterException();
	}
	
	/**
	 * The postfix <code>increment</code> operator. This is the equivalent to the Java's <code>++</code> postfix function.
	 * 
	 * @param d  a double.
	 * @return   <code>d++</code>
	 * @since 2.6
	 */
	@Inline(value="$1++")
	public static double operator_plusPlus(double d) {
		throw new HardcodedInInterpreterException();
	}
	
	/**
	 * The postfix <code>increment</code> operator. This is the equivalent to the Java's <code>++</code> postfix function.
	 * 
	 * @param d  a double.
	 * @return   <code>d++</code>
	 * @since 2.6
	 */
	@Inline(value="$1++")
	public static Double operator_plusPlus(Double d) {
		throw new HardcodedInInterpreterException();
	}
	/**
	 * The binary <code>plus</code> operator. This is the equivalent to the Java <code>+</code> operator.
	 * 
	 * @param a  a double.
	 * @param b  a double.
	 * @return   <code>a+b</code>
	 * @since 2.3
	 */
	@Pure
	@Inline(value="($1 + $2)", constantExpression=true)
	public static double operator_plus(double a, double b) {
		return a + b;
	}
	
	/**
	 * The binary <code>minus</code> operator. This is the equivalent to the Java <code>-</code> operator.
	 * 
	 * @param a  a double.
	 * @param b  a double.
	 * @return   <code>a-b</code>
	 * @since 2.3
	 */
	@Pure
	@Inline(value="($1 - $2)", constantExpression=true)
	public static double operator_minus(double a, double b) {
		return a - b;
	}
	
	/**
	 * The binary <code>multiply</code> operator. This is the equivalent to the Java <code>*</code> operator.
	 * 
	 * @param a  a double.
	 * @param b  a double.
	 * @return   <code>a*b</code>
	 * @since 2.3
	 */
	@Pure
	@Inline(value="($1 * $2)", constantExpression=true)
	public static double operator_multiply(double a, double b) {
		return a * b;
	}
	
	/**
	 * The binary <code>divide</code> operator. This is the equivalent to the Java <code>/</code> operator.
	 * 
	 * @param a  a double.
	 * @param b  a double.
	 * @return   <code>a/b</code>
	 * @since 2.3
	 */
	@Pure
	@Inline(value="($1 / $2)", constantExpression=true)
	public static double operator_divide(double a, double b) {
		return a / b;
	}
	
	/**
	 * The binary <code>modulo</code> operator. This is the equivalent to the Java <code>%</code> operator.
	 * 
	 * @param a  a double.
	 * @param b  a double.
	 * @return   <code>a%b</code>
	 * @since 2.3
	 */
	@Pure
	@Inline(value="($1 % $2)", constantExpression=true)
	public static double operator_modulo(double a, double b) {
		return a % b;
	}
	
	/**
	 * The binary <code>lessThan</code> operator. This is the equivalent to the Java <code>&lt;</code> operator.
	 * 
	 * @param a  a double.
	 * @param b  a double.
	 * @return   <code>a&lt;b</code>
	 * @since 2.3
	 */
	@Pure
	@Inline(value="($1 < $2)", constantExpression=true)
	public static boolean operator_lessThan(double a, double b) {
		return a < b;
	}
	
	/**
	 * The binary <code>lessEqualsThan</code> operator. This is the equivalent to the Java <code>&lt;=</code> operator.
	 * 
	 * @param a  a double.
	 * @param b  a double.
	 * @return   <code>a&lt;=b</code>
	 * @since 2.3
	 */
	@Pure
	@Inline(value="($1 <= $2)", constantExpression=true)
	public static boolean operator_lessEqualsThan(double a, double b) {
		return a <= b;
	}
	
	/**
	 * The binary <code>greaterThan</code> operator. This is the equivalent to the Java <code>&gt;</code> operator.
	 * 
	 * @param a  a double.
	 * @param b  a double.
	 * @return   <code>a&gt;b</code>
	 * @since 2.3
	 */
	@Pure
	@Inline(value="($1 > $2)", constantExpression=true)
	public static boolean operator_greaterThan(double a, double b) {
		return a > b;
	}
	
	/**
	 * The binary <code>greaterEqualsThan</code> operator. This is the equivalent to the Java <code>&gt;=</code> operator.
	 * 
	 * @param a  a double.
	 * @param b  a double.
	 * @return   <code>a&gt;=b</code>
	 * @since 2.3
	 */
	@Pure
	@Inline(value="($1 >= $2)", constantExpression=true)
	public static boolean operator_greaterEqualsThan(double a, double b) {
		return a >= b;
	}
	
	/**
	 * The binary <code>equals</code> operator. This is the equivalent to the Java <code>==</code> operator.
	 * 
	 * @param a  a double.
	 * @param b  a double.
	 * @return   <code>a==b</code>
	 * @since 2.3
	 */
	@Pure
	@Inline(value="($1 == $2)", constantExpression=true)
	public static boolean operator_equals(double a, double b) {
		return a == b;
	}
	
	/**
	 * The binary <code>notEquals</code> operator. This is the equivalent to the Java <code>!=</code> operator.
	 * 
	 * @param a  a double.
	 * @param b  a double.
	 * @return   <code>a!=b</code>
	 * @since 2.3
	 */
	@Pure
	@Inline(value="($1 != $2)", constantExpression=true)
	public static boolean operator_notEquals(double a, double b) {
		return a != b;
	}
	
	/**
	 * The binary <code>power</code> operator. This is the equivalent to the Java's <code>Math.pow()</code> function.
	 * 
	 * @param a  a double.
	 * @param b  a double.
	 * @return   <code>Math.pow(a, b)</code>
	 * @since 2.3
	 */
	@Pure
	@Inline(value="$3.pow($1, $2)", imported=Math.class)
	public static double operator_power(double a, double b) {
		return Math.pow(a, b);
	}
	
	/**
	 * The <code>identity equals</code> operator. This is the equivalent to Java's <code>==</code>
	 * operator.
	 * 
	 * @param a  a double.
	 * @param b  a double.
	 * @return   <code>a == b</code>
	 * @since 2.4
	 */
	@Pure
	@Inline(value="($1 == $2)", constantExpression=true)
	public static boolean operator_tripleEquals(double a, double b) {
		return a == b;
	}
	
	/**
	 * The <code>identity not equals</code> operator. This is the equivalent to Java's <code>!=</code>
	 * operator.
	 * 
	 * @param a  a double.
	 * @param b  a double.
	 * @return   <code>a != b</code>
	 * @since 2.4
	 */
	@Pure
	@Inline(value="($1 != $2)", constantExpression=true)
	public static boolean operator_tripleNotEquals(double a, double b) {
		return a != b;
	}
	
	/**
	 * The binary <code>plus</code> operator. This is the equivalent to the Java <code>+</code> operator.
	 * 
	 * @param a  a double.
	 * @param b  a float.
	 * @return   <code>a+b</code>
	 * @since 2.3
	 */
	@Pure
	@Inline(value="($1 + $2)", constantExpression=true)
	public static double operator_plus(double a, float b) {
		return a + b;
	}
	
	/**
	 * The binary <code>minus</code> operator. This is the equivalent to the Java <code>-</code> operator.
	 * 
	 * @param a  a double.
	 * @param b  a float.
	 * @return   <code>a-b</code>
	 * @since 2.3
	 */
	@Pure
	@Inline(value="($1 - $2)", constantExpression=true)
	public static double operator_minus(double a, float b) {
		return a - b;
	}
	
	/**
	 * The binary <code>multiply</code> operator. This is the equivalent to the Java <code>*</code> operator.
	 * 
	 * @param a  a double.
	 * @param b  a float.
	 * @return   <code>a*b</code>
	 * @since 2.3
	 */
	@Pure
	@Inline(value="($1 * $2)", constantExpression=true)
	public static double operator_multiply(double a, float b) {
		return a * b;
	}
	
	/**
	 * The binary <code>divide</code> operator. This is the equivalent to the Java <code>/</code> operator.
	 * 
	 * @param a  a double.
	 * @param b  a float.
	 * @return   <code>a/b</code>
	 * @since 2.3
	 */
	@Pure
	@Inline(value="($1 / $2)", constantExpression=true)
	public static double operator_divide(double a, float b) {
		return a / b;
	}
	
	/**
	 * The binary <code>modulo</code> operator. This is the equivalent to the Java <code>%</code> operator.
	 * 
	 * @param a  a double.
	 * @param b  a float.
	 * @return   <code>a%b</code>
	 * @since 2.3
	 */
	@Pure
	@Inline(value="($1 % $2)", constantExpression=true)
	public static double operator_modulo(double a, float b) {
		return a % b;
	}
	
	/**
	 * The binary <code>lessThan</code> operator. This is the equivalent to the Java <code>&lt;</code> operator.
	 * 
	 * @param a  a double.
	 * @param b  a float.
	 * @return   <code>a&lt;b</code>
	 * @since 2.3
	 */
	@Pure
	@Inline(value="($1 < $2)", constantExpression=true)
	public static boolean operator_lessThan(double a, float b) {
		return a < b;
	}
	
	/**
	 * The binary <code>lessEqualsThan</code> operator. This is the equivalent to the Java <code>&lt;=</code> operator.
	 * 
	 * @param a  a double.
	 * @param b  a float.
	 * @return   <code>a&lt;=b</code>
	 * @since 2.3
	 */
	@Pure
	@Inline(value="($1 <= $2)", constantExpression=true)
	public static boolean operator_lessEqualsThan(double a, float b) {
		return a <= b;
	}
	
	/**
	 * The binary <code>greaterThan</code> operator. This is the equivalent to the Java <code>&gt;</code> operator.
	 * 
	 * @param a  a double.
	 * @param b  a float.
	 * @return   <code>a&gt;b</code>
	 * @since 2.3
	 */
	@Pure
	@Inline(value="($1 > $2)", constantExpression=true)
	public static boolean operator_greaterThan(double a, float b) {
		return a > b;
	}
	
	/**
	 * The binary <code>greaterEqualsThan</code> operator. This is the equivalent to the Java <code>&gt;=</code> operator.
	 * 
	 * @param a  a double.
	 * @param b  a float.
	 * @return   <code>a&gt;=b</code>
	 * @since 2.3
	 */
	@Pure
	@Inline(value="($1 >= $2)", constantExpression=true)
	public static boolean operator_greaterEqualsThan(double a, float b) {
		return a >= b;
	}
	
	/**
	 * The binary <code>equals</code> operator. This is the equivalent to the Java <code>==</code> operator.
	 * 
	 * @param a  a double.
	 * @param b  a float.
	 * @return   <code>a==b</code>
	 * @since 2.3
	 */
	@Pure
	@Inline(value="($1 == $2)", constantExpression=true)
	public static boolean operator_equals(double a, float b) {
		return a == b;
	}
	
	/**
	 * The binary <code>notEquals</code> operator. This is the equivalent to the Java <code>!=</code> operator.
	 * 
	 * @param a  a double.
	 * @param b  a float.
	 * @return   <code>a!=b</code>
	 * @since 2.3
	 */
	@Pure
	@Inline(value="($1 != $2)", constantExpression=true)
	public static boolean operator_notEquals(double a, float b) {
		return a != b;
	}
	
	/**
	 * The binary <code>power</code> operator. This is the equivalent to the Java's <code>Math.pow()</code> function.
	 * 
	 * @param a  a double.
	 * @param b  a float.
	 * @return   <code>Math.pow(a, b)</code>
	 * @since 2.3
	 */
	@Pure
	@Inline(value="$3.pow($1, $2)", imported=Math.class)
	public static double operator_power(double a, float b) {
		return Math.pow(a, b);
	}
	
	/**
	 * The <code>identity equals</code> operator. This is the equivalent to Java's <code>==</code>
	 * operator.
	 * 
	 * @param a  a double.
	 * @param b  a float.
	 * @return   <code>a == b</code>
	 * @since 2.4
	 */
	@Pure
	@Inline(value="($1 == $2)", constantExpression=true)
	public static boolean operator_tripleEquals(double a, float b) {
		return a == b;
	}
	
	/**
	 * The <code>identity not equals</code> operator. This is the equivalent to Java's <code>!=</code>
	 * operator.
	 * 
	 * @param a  a double.
	 * @param b  a float.
	 * @return   <code>a != b</code>
	 * @since 2.4
	 */
	@Pure
	@Inline(value="($1 != $2)", constantExpression=true)
	public static boolean operator_tripleNotEquals(double a, float b) {
		return a != b;
	}
	
	/**
	 * The binary <code>plus</code> operator. This is the equivalent to the Java <code>+</code> operator.
	 * 
	 * @param a  a double.
	 * @param b  a long.
	 * @return   <code>a+b</code>
	 * @since 2.3
	 */
	@Pure
	@Inline(value="($1 + $2)", constantExpression=true)
	public static double operator_plus(double a, long b) {
		return a + b;
	}
	
	/**
	 * The binary <code>minus</code> operator. This is the equivalent to the Java <code>-</code> operator.
	 * 
	 * @param a  a double.
	 * @param b  a long.
	 * @return   <code>a-b</code>
	 * @since 2.3
	 */
	@Pure
	@Inline(value="($1 - $2)", constantExpression=true)
	public static double operator_minus(double a, long b) {
		return a - b;
	}
	
	/**
	 * The binary <code>multiply</code> operator. This is the equivalent to the Java <code>*</code> operator.
	 * 
	 * @param a  a double.
	 * @param b  a long.
	 * @return   <code>a*b</code>
	 * @since 2.3
	 */
	@Pure
	@Inline(value="($1 * $2)", constantExpression=true)
	public static double operator_multiply(double a, long b) {
		return a * b;
	}
	
	/**
	 * The binary <code>divide</code> operator. This is the equivalent to the Java <code>/</code> operator.
	 * 
	 * @param a  a double.
	 * @param b  a long.
	 * @return   <code>a/b</code>
	 * @since 2.3
	 */
	@Pure
	@Inline(value="($1 / $2)", constantExpression=true)
	public static double operator_divide(double a, long b) {
		return a / b;
	}
	
	/**
	 * The binary <code>modulo</code> operator. This is the equivalent to the Java <code>%</code> operator.
	 * 
	 * @param a  a double.
	 * @param b  a long.
	 * @return   <code>a%b</code>
	 * @since 2.3
	 */
	@Pure
	@Inline(value="($1 % $2)", constantExpression=true)
	public static double operator_modulo(double a, long b) {
		return a % b;
	}
	
	/**
	 * The binary <code>lessThan</code> operator. This is the equivalent to the Java <code>&lt;</code> operator.
	 * 
	 * @param a  a double.
	 * @param b  a long.
	 * @return   <code>a&lt;b</code>
	 * @since 2.3
	 */
	@Pure
	@Inline(value="($1 < $2)", constantExpression=true)
	public static boolean operator_lessThan(double a, long b) {
		return a < b;
	}
	
	/**
	 * The binary <code>lessEqualsThan</code> operator. This is the equivalent to the Java <code>&lt;=</code> operator.
	 * 
	 * @param a  a double.
	 * @param b  a long.
	 * @return   <code>a&lt;=b</code>
	 * @since 2.3
	 */
	@Pure
	@Inline(value="($1 <= $2)", constantExpression=true)
	public static boolean operator_lessEqualsThan(double a, long b) {
		return a <= b;
	}
	
	/**
	 * The binary <code>greaterThan</code> operator. This is the equivalent to the Java <code>&gt;</code> operator.
	 * 
	 * @param a  a double.
	 * @param b  a long.
	 * @return   <code>a&gt;b</code>
	 * @since 2.3
	 */
	@Pure
	@Inline(value="($1 > $2)", constantExpression=true)
	public static boolean operator_greaterThan(double a, long b) {
		return a > b;
	}
	
	/**
	 * The binary <code>greaterEqualsThan</code> operator. This is the equivalent to the Java <code>&gt;=</code> operator.
	 * 
	 * @param a  a double.
	 * @param b  a long.
	 * @return   <code>a&gt;=b</code>
	 * @since 2.3
	 */
	@Pure
	@Inline(value="($1 >= $2)", constantExpression=true)
	public static boolean operator_greaterEqualsThan(double a, long b) {
		return a >= b;
	}
	
	/**
	 * The binary <code>equals</code> operator. This is the equivalent to the Java <code>==</code> operator.
	 * 
	 * @param a  a double.
	 * @param b  a long.
	 * @return   <code>a==b</code>
	 * @since 2.3
	 */
	@Pure
	@Inline(value="($1 == $2)", constantExpression=true)
	public static boolean operator_equals(double a, long b) {
		return a == b;
	}
	
	/**
	 * The binary <code>notEquals</code> operator. This is the equivalent to the Java <code>!=</code> operator.
	 * 
	 * @param a  a double.
	 * @param b  a long.
	 * @return   <code>a!=b</code>
	 * @since 2.3
	 */
	@Pure
	@Inline(value="($1 != $2)", constantExpression=true)
	public static boolean operator_notEquals(double a, long b) {
		return a != b;
	}
	
	/**
	 * The binary <code>power</code> operator. This is the equivalent to the Java's <code>Math.pow()</code> function.
	 * 
	 * @param a  a double.
	 * @param b  a long.
	 * @return   <code>Math.pow(a, b)</code>
	 * @since 2.3
	 */
	@Pure
	@Inline(value="$3.pow($1, $2)", imported=Math.class)
	public static double operator_power(double a, long b) {
		return Math.pow(a, b);
	}
	
	/**
	 * The <code>identity equals</code> operator. This is the equivalent to Java's <code>==</code>
	 * operator.
	 * 
	 * @param a  a double.
	 * @param b  a long.
	 * @return   <code>a == b</code>
	 * @since 2.4
	 */
	@Pure
	@Inline(value="($1 == $2)", constantExpression=true)
	public static boolean operator_tripleEquals(double a, long b) {
		return a == b;
	}
	
	/**
	 * The <code>identity not equals</code> operator. This is the equivalent to Java's <code>!=</code>
	 * operator.
	 * 
	 * @param a  a double.
	 * @param b  a long.
	 * @return   <code>a != b</code>
	 * @since 2.4
	 */
	@Pure
	@Inline(value="($1 != $2)", constantExpression=true)
	public static boolean operator_tripleNotEquals(double a, long b) {
		return a != b;
	}
	
	/**
	 * The binary <code>plus</code> operator. This is the equivalent to the Java <code>+</code> operator.
	 * 
	 * @param a  a double.
	 * @param b  an integer.
	 * @return   <code>a+b</code>
	 * @since 2.3
	 */
	@Pure
	@Inline(value="($1 + $2)", constantExpression=true)
	public static double operator_plus(double a, int b) {
		return a + b;
	}
	
	/**
	 * The binary <code>minus</code> operator. This is the equivalent to the Java <code>-</code> operator.
	 * 
	 * @param a  a double.
	 * @param b  an integer.
	 * @return   <code>a-b</code>
	 * @since 2.3
	 */
	@Pure
	@Inline(value="($1 - $2)", constantExpression=true)
	public static double operator_minus(double a, int b) {
		return a - b;
	}
	
	/**
	 * The binary <code>multiply</code> operator. This is the equivalent to the Java <code>*</code> operator.
	 * 
	 * @param a  a double.
	 * @param b  an integer.
	 * @return   <code>a*b</code>
	 * @since 2.3
	 */
	@Pure
	@Inline(value="($1 * $2)", constantExpression=true)
	public static double operator_multiply(double a, int b) {
		return a * b;
	}
	
	/**
	 * The binary <code>divide</code> operator. This is the equivalent to the Java <code>/</code> operator.
	 * 
	 * @param a  a double.
	 * @param b  an integer.
	 * @return   <code>a/b</code>
	 * @since 2.3
	 */
	@Pure
	@Inline(value="($1 / $2)", constantExpression=true)
	public static double operator_divide(double a, int b) {
		return a / b;
	}
	
	/**
	 * The binary <code>modulo</code> operator. This is the equivalent to the Java <code>%</code> operator.
	 * 
	 * @param a  a double.
	 * @param b  an integer.
	 * @return   <code>a%b</code>
	 * @since 2.3
	 */
	@Pure
	@Inline(value="($1 % $2)", constantExpression=true)
	public static double operator_modulo(double a, int b) {
		return a % b;
	}
	
	/**
	 * The binary <code>lessThan</code> operator. This is the equivalent to the Java <code>&lt;</code> operator.
	 * 
	 * @param a  a double.
	 * @param b  an integer.
	 * @return   <code>a&lt;b</code>
	 * @since 2.3
	 */
	@Pure
	@Inline(value="($1 < $2)", constantExpression=true)
	public static boolean operator_lessThan(double a, int b) {
		return a < b;
	}
	
	/**
	 * The binary <code>lessEqualsThan</code> operator. This is the equivalent to the Java <code>&lt;=</code> operator.
	 * 
	 * @param a  a double.
	 * @param b  an integer.
	 * @return   <code>a&lt;=b</code>
	 * @since 2.3
	 */
	@Pure
	@Inline(value="($1 <= $2)", constantExpression=true)
	public static boolean operator_lessEqualsThan(double a, int b) {
		return a <= b;
	}
	
	/**
	 * The binary <code>greaterThan</code> operator. This is the equivalent to the Java <code>&gt;</code> operator.
	 * 
	 * @param a  a double.
	 * @param b  an integer.
	 * @return   <code>a&gt;b</code>
	 * @since 2.3
	 */
	@Pure
	@Inline(value="($1 > $2)", constantExpression=true)
	public static boolean operator_greaterThan(double a, int b) {
		return a > b;
	}
	
	/**
	 * The binary <code>greaterEqualsThan</code> operator. This is the equivalent to the Java <code>&gt;=</code> operator.
	 * 
	 * @param a  a double.
	 * @param b  an integer.
	 * @return   <code>a&gt;=b</code>
	 * @since 2.3
	 */
	@Pure
	@Inline(value="($1 >= $2)", constantExpression=true)
	public static boolean operator_greaterEqualsThan(double a, int b) {
		return a >= b;
	}
	
	/**
	 * The binary <code>equals</code> operator. This is the equivalent to the Java <code>==</code> operator.
	 * 
	 * @param a  a double.
	 * @param b  an integer.
	 * @return   <code>a==b</code>
	 * @since 2.3
	 */
	@Pure
	@Inline(value="($1 == $2)", constantExpression=true)
	public static boolean operator_equals(double a, int b) {
		return a == b;
	}
	
	/**
	 * The binary <code>notEquals</code> operator. This is the equivalent to the Java <code>!=</code> operator.
	 * 
	 * @param a  a double.
	 * @param b  an integer.
	 * @return   <code>a!=b</code>
	 * @since 2.3
	 */
	@Pure
	@Inline(value="($1 != $2)", constantExpression=true)
	public static boolean operator_notEquals(double a, int b) {
		return a != b;
	}
	
	/**
	 * The binary <code>power</code> operator. This is the equivalent to the Java's <code>Math.pow()</code> function.
	 * 
	 * @param a  a double.
	 * @param b  an integer.
	 * @return   <code>Math.pow(a, b)</code>
	 * @since 2.3
	 */
	@Pure
	@Inline(value="$3.pow($1, $2)", imported=Math.class)
	public static double operator_power(double a, int b) {
		return Math.pow(a, b);
	}
	
	/**
	 * The <code>identity equals</code> operator. This is the equivalent to Java's <code>==</code>
	 * operator.
	 * 
	 * @param a  a double.
	 * @param b  an integer.
	 * @return   <code>a == b</code>
	 * @since 2.4
	 */
	@Pure
	@Inline(value="($1 == $2)", constantExpression=true)
	public static boolean operator_tripleEquals(double a, int b) {
		return a == b;
	}
	
	/**
	 * The <code>identity not equals</code> operator. This is the equivalent to Java's <code>!=</code>
	 * operator.
	 * 
	 * @param a  a double.
	 * @param b  an integer.
	 * @return   <code>a != b</code>
	 * @since 2.4
	 */
	@Pure
	@Inline(value="($1 != $2)", constantExpression=true)
	public static boolean operator_tripleNotEquals(double a, int b) {
		return a != b;
	}
	
	/**
	 * The binary <code>plus</code> operator. This is the equivalent to the Java <code>+</code> operator.
	 * 
	 * @param a  a double.
	 * @param b  a character.
	 * @return   <code>a+b</code>
	 * @since 2.3
	 */
	@Pure
	@Inline(value="($1 + $2)", constantExpression=true)
	public static double operator_plus(double a, char b) {
		return a + b;
	}
	
	/**
	 * The binary <code>minus</code> operator. This is the equivalent to the Java <code>-</code> operator.
	 * 
	 * @param a  a double.
	 * @param b  a character.
	 * @return   <code>a-b</code>
	 * @since 2.3
	 */
	@Pure
	@Inline(value="($1 - $2)", constantExpression=true)
	public static double operator_minus(double a, char b) {
		return a - b;
	}
	
	/**
	 * The binary <code>multiply</code> operator. This is the equivalent to the Java <code>*</code> operator.
	 * 
	 * @param a  a double.
	 * @param b  a character.
	 * @return   <code>a*b</code>
	 * @since 2.3
	 */
	@Pure
	@Inline(value="($1 * $2)", constantExpression=true)
	public static double operator_multiply(double a, char b) {
		return a * b;
	}
	
	/**
	 * The binary <code>divide</code> operator. This is the equivalent to the Java <code>/</code> operator.
	 * 
	 * @param a  a double.
	 * @param b  a character.
	 * @return   <code>a/b</code>
	 * @since 2.3
	 */
	@Pure
	@Inline(value="($1 / $2)", constantExpression=true)
	public static double operator_divide(double a, char b) {
		return a / b;
	}
	
	/**
	 * The binary <code>modulo</code> operator. This is the equivalent to the Java <code>%</code> operator.
	 * 
	 * @param a  a double.
	 * @param b  a character.
	 * @return   <code>a%b</code>
	 * @since 2.3
	 */
	@Pure
	@Inline(value="($1 % $2)", constantExpression=true)
	public static double operator_modulo(double a, char b) {
		return a % b;
	}
	
	/**
	 * The binary <code>lessThan</code> operator. This is the equivalent to the Java <code>&lt;</code> operator.
	 * 
	 * @param a  a double.
	 * @param b  a character.
	 * @return   <code>a&lt;b</code>
	 * @since 2.3
	 */
	@Pure
	@Inline(value="($1 < $2)", constantExpression=true)
	public static boolean operator_lessThan(double a, char b) {
		return a < b;
	}
	
	/**
	 * The binary <code>lessEqualsThan</code> operator. This is the equivalent to the Java <code>&lt;=</code> operator.
	 * 
	 * @param a  a double.
	 * @param b  a character.
	 * @return   <code>a&lt;=b</code>
	 * @since 2.3
	 */
	@Pure
	@Inline(value="($1 <= $2)", constantExpression=true)
	public static boolean operator_lessEqualsThan(double a, char b) {
		return a <= b;
	}
	
	/**
	 * The binary <code>greaterThan</code> operator. This is the equivalent to the Java <code>&gt;</code> operator.
	 * 
	 * @param a  a double.
	 * @param b  a character.
	 * @return   <code>a&gt;b</code>
	 * @since 2.3
	 */
	@Pure
	@Inline(value="($1 > $2)", constantExpression=true)
	public static boolean operator_greaterThan(double a, char b) {
		return a > b;
	}
	
	/**
	 * The binary <code>greaterEqualsThan</code> operator. This is the equivalent to the Java <code>&gt;=</code> operator.
	 * 
	 * @param a  a double.
	 * @param b  a character.
	 * @return   <code>a&gt;=b</code>
	 * @since 2.3
	 */
	@Pure
	@Inline(value="($1 >= $2)", constantExpression=true)
	public static boolean operator_greaterEqualsThan(double a, char b) {
		return a >= b;
	}
	
	/**
	 * The binary <code>equals</code> operator. This is the equivalent to the Java <code>==</code> operator.
	 * 
	 * @param a  a double.
	 * @param b  a character.
	 * @return   <code>a==b</code>
	 * @since 2.3
	 */
	@Pure
	@Inline(value="($1 == $2)", constantExpression=true)
	public static boolean operator_equals(double a, char b) {
		return a == b;
	}
	
	/**
	 * The binary <code>notEquals</code> operator. This is the equivalent to the Java <code>!=</code> operator.
	 * 
	 * @param a  a double.
	 * @param b  a character.
	 * @return   <code>a!=b</code>
	 * @since 2.3
	 */
	@Pure
	@Inline(value="($1 != $2)", constantExpression=true)
	public static boolean operator_notEquals(double a, char b) {
		return a != b;
	}
	
	/**
	 * The binary <code>power</code> operator. This is the equivalent to the Java's <code>Math.pow()</code> function.
	 * 
	 * @param a  a double.
	 * @param b  a character.
	 * @return   <code>Math.pow(a, b)</code>
	 * @since 2.3
	 */
	@Pure
	@Inline(value="$3.pow($1, $2)", imported=Math.class)
	public static double operator_power(double a, char b) {
		return Math.pow(a, b);
	}
	
	/**
	 * The <code>identity equals</code> operator. This is the equivalent to Java's <code>==</code>
	 * operator.
	 * 
	 * @param a  a double.
	 * @param b  a character.
	 * @return   <code>a == b</code>
	 * @since 2.4
	 */
	@Pure
	@Inline(value="($1 == $2)", constantExpression=true)
	public static boolean operator_tripleEquals(double a, char b) {
		return a == b;
	}
	
	/**
	 * The <code>identity not equals</code> operator. This is the equivalent to Java's <code>!=</code>
	 * operator.
	 * 
	 * @param a  a double.
	 * @param b  a character.
	 * @return   <code>a != b</code>
	 * @since 2.4
	 */
	@Pure
	@Inline(value="($1 != $2)", constantExpression=true)
	public static boolean operator_tripleNotEquals(double a, char b) {
		return a != b;
	}
	
	/**
	 * The binary <code>plus</code> operator. This is the equivalent to the Java <code>+</code> operator.
	 * 
	 * @param a  a double.
	 * @param b  a short.
	 * @return   <code>a+b</code>
	 * @since 2.3
	 */
	@Pure
	@Inline(value="($1 + $2)", constantExpression=true)
	public static double operator_plus(double a, short b) {
		return a + b;
	}
	
	/**
	 * The binary <code>minus</code> operator. This is the equivalent to the Java <code>-</code> operator.
	 * 
	 * @param a  a double.
	 * @param b  a short.
	 * @return   <code>a-b</code>
	 * @since 2.3
	 */
	@Pure
	@Inline(value="($1 - $2)", constantExpression=true)
	public static double operator_minus(double a, short b) {
		return a - b;
	}
	
	/**
	 * The binary <code>multiply</code> operator. This is the equivalent to the Java <code>*</code> operator.
	 * 
	 * @param a  a double.
	 * @param b  a short.
	 * @return   <code>a*b</code>
	 * @since 2.3
	 */
	@Pure
	@Inline(value="($1 * $2)", constantExpression=true)
	public static double operator_multiply(double a, short b) {
		return a * b;
	}
	
	/**
	 * The binary <code>divide</code> operator. This is the equivalent to the Java <code>/</code> operator.
	 * 
	 * @param a  a double.
	 * @param b  a short.
	 * @return   <code>a/b</code>
	 * @since 2.3
	 */
	@Pure
	@Inline(value="($1 / $2)", constantExpression=true)
	public static double operator_divide(double a, short b) {
		return a / b;
	}
	
	/**
	 * The binary <code>modulo</code> operator. This is the equivalent to the Java <code>%</code> operator.
	 * 
	 * @param a  a double.
	 * @param b  a short.
	 * @return   <code>a%b</code>
	 * @since 2.3
	 */
	@Pure
	@Inline(value="($1 % $2)", constantExpression=true)
	public static double operator_modulo(double a, short b) {
		return a % b;
	}
	
	/**
	 * The binary <code>lessThan</code> operator. This is the equivalent to the Java <code>&lt;</code> operator.
	 * 
	 * @param a  a double.
	 * @param b  a short.
	 * @return   <code>a&lt;b</code>
	 * @since 2.3
	 */
	@Pure
	@Inline(value="($1 < $2)", constantExpression=true)
	public static boolean operator_lessThan(double a, short b) {
		return a < b;
	}
	
	/**
	 * The binary <code>lessEqualsThan</code> operator. This is the equivalent to the Java <code>&lt;=</code> operator.
	 * 
	 * @param a  a double.
	 * @param b  a short.
	 * @return   <code>a&lt;=b</code>
	 * @since 2.3
	 */
	@Pure
	@Inline(value="($1 <= $2)", constantExpression=true)
	public static boolean operator_lessEqualsThan(double a, short b) {
		return a <= b;
	}
	
	/**
	 * The binary <code>greaterThan</code> operator. This is the equivalent to the Java <code>&gt;</code> operator.
	 * 
	 * @param a  a double.
	 * @param b  a short.
	 * @return   <code>a&gt;b</code>
	 * @since 2.3
	 */
	@Pure
	@Inline(value="($1 > $2)", constantExpression=true)
	public static boolean operator_greaterThan(double a, short b) {
		return a > b;
	}
	
	/**
	 * The binary <code>greaterEqualsThan</code> operator. This is the equivalent to the Java <code>&gt;=</code> operator.
	 * 
	 * @param a  a double.
	 * @param b  a short.
	 * @return   <code>a&gt;=b</code>
	 * @since 2.3
	 */
	@Pure
	@Inline(value="($1 >= $2)", constantExpression=true)
	public static boolean operator_greaterEqualsThan(double a, short b) {
		return a >= b;
	}
	
	/**
	 * The binary <code>equals</code> operator. This is the equivalent to the Java <code>==</code> operator.
	 * 
	 * @param a  a double.
	 * @param b  a short.
	 * @return   <code>a==b</code>
	 * @since 2.3
	 */
	@Pure
	@Inline(value="($1 == $2)", constantExpression=true)
	public static boolean operator_equals(double a, short b) {
		return a == b;
	}
	
	/**
	 * The binary <code>notEquals</code> operator. This is the equivalent to the Java <code>!=</code> operator.
	 * 
	 * @param a  a double.
	 * @param b  a short.
	 * @return   <code>a!=b</code>
	 * @since 2.3
	 */
	@Pure
	@Inline(value="($1 != $2)", constantExpression=true)
	public static boolean operator_notEquals(double a, short b) {
		return a != b;
	}
	
	/**
	 * The binary <code>power</code> operator. This is the equivalent to the Java's <code>Math.pow()</code> function.
	 * 
	 * @param a  a double.
	 * @param b  a short.
	 * @return   <code>Math.pow(a, b)</code>
	 * @since 2.3
	 */
	@Pure
	@Inline(value="$3.pow($1, $2)", imported=Math.class)
	public static double operator_power(double a, short b) {
		return Math.pow(a, b);
	}
	
	/**
	 * The <code>identity equals</code> operator. This is the equivalent to Java's <code>==</code>
	 * operator.
	 * 
	 * @param a  a double.
	 * @param b  a short.
	 * @return   <code>a == b</code>
	 * @since 2.4
	 */
	@Pure
	@Inline(value="($1 == $2)", constantExpression=true)
	public static boolean operator_tripleEquals(double a, short b) {
		return a == b;
	}
	
	/**
	 * The <code>identity not equals</code> operator. This is the equivalent to Java's <code>!=</code>
	 * operator.
	 * 
	 * @param a  a double.
	 * @param b  a short.
	 * @return   <code>a != b</code>
	 * @since 2.4
	 */
	@Pure
	@Inline(value="($1 != $2)", constantExpression=true)
	public static boolean operator_tripleNotEquals(double a, short b) {
		return a != b;
	}
	
	/**
	 * The binary <code>plus</code> operator. This is the equivalent to the Java <code>+</code> operator.
	 * 
	 * @param a  a double.
	 * @param b  a byte.
	 * @return   <code>a+b</code>
	 * @since 2.3
	 */
	@Pure
	@Inline(value="($1 + $2)", constantExpression=true)
	public static double operator_plus(double a, byte b) {
		return a + b;
	}
	
	/**
	 * The binary <code>minus</code> operator. This is the equivalent to the Java <code>-</code> operator.
	 * 
	 * @param a  a double.
	 * @param b  a byte.
	 * @return   <code>a-b</code>
	 * @since 2.3
	 */
	@Pure
	@Inline(value="($1 - $2)", constantExpression=true)
	public static double operator_minus(double a, byte b) {
		return a - b;
	}
	
	/**
	 * The binary <code>multiply</code> operator. This is the equivalent to the Java <code>*</code> operator.
	 * 
	 * @param a  a double.
	 * @param b  a byte.
	 * @return   <code>a*b</code>
	 * @since 2.3
	 */
	@Pure
	@Inline(value="($1 * $2)", constantExpression=true)
	public static double operator_multiply(double a, byte b) {
		return a * b;
	}
	
	/**
	 * The binary <code>divide</code> operator. This is the equivalent to the Java <code>/</code> operator.
	 * 
	 * @param a  a double.
	 * @param b  a byte.
	 * @return   <code>a/b</code>
	 * @since 2.3
	 */
	@Pure
	@Inline(value="($1 / $2)", constantExpression=true)
	public static double operator_divide(double a, byte b) {
		return a / b;
	}
	
	/**
	 * The binary <code>modulo</code> operator. This is the equivalent to the Java <code>%</code> operator.
	 * 
	 * @param a  a double.
	 * @param b  a byte.
	 * @return   <code>a%b</code>
	 * @since 2.3
	 */
	@Pure
	@Inline(value="($1 % $2)", constantExpression=true)
	public static double operator_modulo(double a, byte b) {
		return a % b;
	}
	
	/**
	 * The binary <code>lessThan</code> operator. This is the equivalent to the Java <code>&lt;</code> operator.
	 * 
	 * @param a  a double.
	 * @param b  a byte.
	 * @return   <code>a&lt;b</code>
	 * @since 2.3
	 */
	@Pure
	@Inline(value="($1 < $2)", constantExpression=true)
	public static boolean operator_lessThan(double a, byte b) {
		return a < b;
	}
	
	/**
	 * The binary <code>lessEqualsThan</code> operator. This is the equivalent to the Java <code>&lt;=</code> operator.
	 * 
	 * @param a  a double.
	 * @param b  a byte.
	 * @return   <code>a&lt;=b</code>
	 * @since 2.3
	 */
	@Pure
	@Inline(value="($1 <= $2)", constantExpression=true)
	public static boolean operator_lessEqualsThan(double a, byte b) {
		return a <= b;
	}
	
	/**
	 * The binary <code>greaterThan</code> operator. This is the equivalent to the Java <code>&gt;</code> operator.
	 * 
	 * @param a  a double.
	 * @param b  a byte.
	 * @return   <code>a&gt;b</code>
	 * @since 2.3
	 */
	@Pure
	@Inline(value="($1 > $2)", constantExpression=true)
	public static boolean operator_greaterThan(double a, byte b) {
		return a > b;
	}
	
	/**
	 * The binary <code>greaterEqualsThan</code> operator. This is the equivalent to the Java <code>&gt;=</code> operator.
	 * 
	 * @param a  a double.
	 * @param b  a byte.
	 * @return   <code>a&gt;=b</code>
	 * @since 2.3
	 */
	@Pure
	@Inline(value="($1 >= $2)", constantExpression=true)
	public static boolean operator_greaterEqualsThan(double a, byte b) {
		return a >= b;
	}
	
	/**
	 * The binary <code>equals</code> operator. This is the equivalent to the Java <code>==</code> operator.
	 * 
	 * @param a  a double.
	 * @param b  a byte.
	 * @return   <code>a==b</code>
	 * @since 2.3
	 */
	@Pure
	@Inline(value="($1 == $2)", constantExpression=true)
	public static boolean operator_equals(double a, byte b) {
		return a == b;
	}
	
	/**
	 * The binary <code>notEquals</code> operator. This is the equivalent to the Java <code>!=</code> operator.
	 * 
	 * @param a  a double.
	 * @param b  a byte.
	 * @return   <code>a!=b</code>
	 * @since 2.3
	 */
	@Pure
	@Inline(value="($1 != $2)", constantExpression=true)
	public static boolean operator_notEquals(double a, byte b) {
		return a != b;
	}
	
	/**
	 * The binary <code>power</code> operator. This is the equivalent to the Java's <code>Math.pow()</code> function.
	 * 
	 * @param a  a double.
	 * @param b  a byte.
	 * @return   <code>Math.pow(a, b)</code>
	 * @since 2.3
	 */
	@Pure
	@Inline(value="$3.pow($1, $2)", imported=Math.class)
	public static double operator_power(double a, byte b) {
		return Math.pow(a, b);
	}
	
	/**
	 * The <code>identity equals</code> operator. This is the equivalent to Java's <code>==</code>
	 * operator.
	 * 
	 * @param a  a double.
	 * @param b  a byte.
	 * @return   <code>a == b</code>
	 * @since 2.4
	 */
	@Pure
	@Inline(value="($1 == $2)", constantExpression=true)
	public static boolean operator_tripleEquals(double a, byte b) {
		return a == b;
	}
	
	/**
	 * The <code>identity not equals</code> operator. This is the equivalent to Java's <code>!=</code>
	 * operator.
	 * 
	 * @param a  a double.
	 * @param b  a byte.
	 * @return   <code>a != b</code>
	 * @since 2.4
	 */
	@Pure
	@Inline(value="($1 != $2)", constantExpression=true)
	public static boolean operator_tripleNotEquals(double a, byte b) {
		return a != b;
	}
	
	// END generated code
}
