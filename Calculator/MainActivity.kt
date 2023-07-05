package com.example.calculadoraac04

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.widget.Toast
import kotlin.math.roundToInt

class MainActivity : AppCompatActivity() {
    lateinit var painel: TextView
    lateinit var painelOper: TextView
    var textoPainel = "0"
    var num1: String = ""
    var num2: String = ""
    var oper = ""
    var cont = false
    var roundoff = 0.0


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        painel = findViewById<TextView>(R.id.painel)
        painelOper = findViewById<TextView>(R.id.painelOper)
    }

    fun botao0(view: View) {
        if (textoPainel == "0") {
            return
        } else if (cont == true) {
            num1 = ""
            cont = false
            textoPainel += "0"
            painel.setText(textoPainel)
        } else {
            textoPainel += "0"
            painel.setText(textoPainel)
        }
    }

    fun botao1(view: View) {
        if (textoPainel == "0") {
            textoPainel = "1"
            painel.setText(textoPainel)
        } else if (cont == true) {
            num1 = ""
            cont = false
            textoPainel = "1"
            painel.setText(textoPainel)
        } else {
            textoPainel += "1"
            painel.setText(textoPainel)
        }
    }

    fun botao2(view: View) {
        if (textoPainel == "0") {
            textoPainel = "2"
            painel.setText(textoPainel)
        } else if (cont == true) {
            num1 = ""
            cont = false
            textoPainel = "2"
            painel.setText(textoPainel)
        } else {
            textoPainel += "2"
            painel.setText(textoPainel)
        }
    }

    fun botao3(view: View) {
        if (textoPainel == "0") {
            textoPainel = "3"
            painel.setText(textoPainel)
        } else if (cont == true) {
            num1 = ""
            cont = false
            textoPainel = "3"
            painel.setText(textoPainel)
        } else {
            textoPainel += "3"
            painel.setText(textoPainel)
        }
    }

    fun botao4(view: View) {
        if (textoPainel == "0") {
            textoPainel = "4"
            painel.setText(textoPainel)
        } else if (cont == true) {
            num1 = ""
            cont = false
            textoPainel = "4"
            painel.setText(textoPainel)
        } else {
            textoPainel += "4"
            painel.setText(textoPainel)
        }
    }

    fun botao5(view: View) {
        if (textoPainel == "0") {
            textoPainel = "5"
            painel.setText(textoPainel)
        } else if (cont == true) {
            num1 = ""
            cont = false
            textoPainel = "5"
            painel.setText(textoPainel)
        } else {
            textoPainel += "5"
            painel.setText(textoPainel)
        }
    }

    fun botao6(view: View) {
        if (textoPainel == "0") {
            textoPainel = "6"
            painel.setText(textoPainel)
        } else if (cont == true) {
            num1 = ""
            cont = false
            textoPainel = "6"
            painel.setText(textoPainel)
        } else {
            textoPainel += "6"
            painel.setText(textoPainel)
        }
    }

    fun botao7(view: View) {
        if (textoPainel == "0") {
            textoPainel = "7"
            painel.setText(textoPainel)
        } else if (cont == true) {
            num1 = ""
            cont = false
            textoPainel = "7"
            painel.setText(textoPainel)
        } else {
            textoPainel += "7"
            painel.setText(textoPainel)
        }
    }

    fun botao8(view: View) {
        if (textoPainel == "0") {
            textoPainel = "8"
            painel.setText(textoPainel)
        } else if (cont == true) {
            num1 = ""
            cont = false
            textoPainel = "8"
            painel.setText(textoPainel)
        } else {
            textoPainel += "8"
            painel.setText(textoPainel)
        }
    }

    fun botao9(view: View) {
        if (textoPainel == "0") {
            textoPainel = "9"
            painel.setText(textoPainel)
        } else if (cont == true) {
            num1 = ""
            cont = false
            textoPainel = "9"
            painel.setText(textoPainel)
        } else {
            textoPainel += "9"
            painel.setText(textoPainel)
        }
    }

    fun botaoPonto(view: View) {
        if (textoPainel.contains(".")) {
            return
        } else {
            textoPainel += "."
            painel.setText(textoPainel)
        }
    }

    fun botaoDel(view: View) {
        if (cont == true) {
            textoPainel = "0"
            painel.setText((textoPainel))
            cont = false
            num1 = ""
            return
        } else if (textoPainel.length == 1 && textoPainel != "0") {
            textoPainel = "0"
            painel.setText(textoPainel)
            return
        } else if (textoPainel == "0" && num1 != "") {
            oper = ""
            painelOper.setText(null)
            num1 = ""
            textoPainel = "0"
            painel.setText(textoPainel)
            return
        } else if (textoPainel == "0" && num1 == "") {
            textoPainel = "0"
            painel.setText(textoPainel)
            return
        } else {
            textoPainel = textoPainel.substring(0, textoPainel.length - 1)
            painel.setText(textoPainel)
        }
    }

    fun botaoClear(view: View) {
        textoPainel = "0"
        painel.setText(textoPainel)
        textoPainel = "0"
        num1 = ""
        num2 = ""
        oper = ""
        painelOper.setText("")
    }

    fun botaoSoma(view: View) {
        if (num1 == "") {
            num1 = textoPainel
            textoPainel = "0"
            oper = "+"
            painel.setText(textoPainel)
            painelOper.setText("Operador: +")
        } else if (cont == true) {
            textoPainel = "0"
            oper = "+"
            painel.setText(textoPainel)
            painelOper.setText("Operador: +")
        } else {
            oper = "+"
            painelOper.setText("Operador: +")
        }
    }

    fun botaoSub(view: View) {
        if (num1 == "") {
            num1 = textoPainel
            textoPainel = "0"
            oper = "-"
            painel.setText(textoPainel)
            painelOper.setText("Operador: -")
        } else if (cont == true) {
            textoPainel = "0"
            oper = "-"
            painel.setText(textoPainel)
            painelOper.setText("Operador: -")
        } else {
            oper = "-"
            painelOper.setText("Operador: -")
        }
    }

    fun botaoMult(view: View) {
        if (num1 == "") {
            num1 = textoPainel
            textoPainel = "0"
            oper = "*"
            painel.setText(textoPainel)
            painelOper.setText("Operador: *")
        } else if (cont == true) {
            textoPainel = "0"
            oper = "*"
            painel.setText(textoPainel)
            painelOper.setText("Operador: *")
        } else {
            oper = "*"
            painelOper.setText("Operador: *")
        }
    }

    fun botaoDiv(view: View) {
        if (num1 == "") {
            num1 = textoPainel
            textoPainel = "0"
            oper = "/"
            painel.setText(textoPainel)
            painelOper.setText("Operador: /")
        } else if (cont == true) {
            textoPainel = "0"
            oper = "/"
            painel.setText(textoPainel)
            painelOper.setText("Operador: /")
        } else {
            oper = "/"
            painelOper.setText("Operador: /")
        }
    }

    fun botaoIgual(view: View) {
        num2 = textoPainel
        if (num2 == "0" && oper == "/") {
            Toast.makeText(applicationContext, "Não é possível dividir por 0", Toast.LENGTH_LONG).show()
        } else if (num1 != "") {
            try {
                if (oper == "+") {
                    var calc = num1.toDouble() + num2.toDouble()
                    roundoff = (calc * 100.0).roundToInt() / 100.0
                    textoPainel = roundoff.toString()
                    painel.setText(textoPainel)
                    painelOper.setText(null)
                    oper = ""
                    num1 = calc.toString()
                    num2 = ""
                    cont = true
                } else if (oper == "-") {
                    var calc = num1.toDouble() - num2.toDouble()
                    roundoff = (calc * 100.0).roundToInt() / 100.0
                    textoPainel = roundoff.toString()
                    painel.setText(textoPainel)
                    painelOper.setText(null)
                    oper = ""
                    num1 = calc.toString()
                    num2 = ""
                    cont = true
                } else if (oper == "*") {
                    var calc = num1.toDouble() * num2.toDouble()
                    roundoff = (calc * 100.0).roundToInt() / 100.0
                    textoPainel = roundoff.toString()
                    painel.setText(textoPainel)
                    painelOper.setText(null)
                    oper = ""
                    num1 = calc.toString()
                    num2 = ""
                    cont = true
                } else if (oper == "/") {
                    var calc = num1.toDouble() / num2.toDouble()
                    roundoff = (calc * 100.0).roundToInt() / 100.0
                    textoPainel = roundoff.toString()
                    painel.setText(textoPainel)
                    painelOper.setText(null)
                    oper = ""
                    num1 = calc.toString()
                    num2 = ""
                    cont = true
                } else {
                    Toast.makeText(
                        applicationContext,
                        "Não foi identificada uma operação",
                        Toast.LENGTH_LONG
                    ).show()
                }
            }catch (e: Exception) {
                Toast.makeText(applicationContext, "Ocorreu um erro: ${e.stackTrace}", Toast.LENGTH_LONG).show()
            }
        }
    }
}
