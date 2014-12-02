/**********************************
 Validaciones Global Admesc
 ***********************************/

function validaCampos(formulario) {
    if (formulario.programa.selectedIndex == 0) {
        alert("Tiene que elegir el Programa Acad\u00e9mico");
        formulario.programa.focus();
        return false;
    }

    if (formulario.periodo.selectedIndex == 0) {
        alert("Tiene que elegir el Periodo Escolar");
        formulario.periodo.focus();
        return false;
    }

    if (formulario.semestre.selectedIndex == 0) {
        alert("Tiene que elegir el Semestre");
        formulario.semestre.focus();
        return false;
    }

    if (formulario.grupo.selectedIndex == 0) {
        alert("Tiene que elegir el Grupo");
        formulario.grupo.focus();
        return false;
    }

    return true;
}

function validaImpresion(reporteEP, escuelaProce) {
    if (reporteEP.programaAcademico.value == "") {
        alert("Debe realizar la busqueda del reporte para poder imprimirlo");
        escuelaProce.programa.focus();
        return false;
    }

    if (reporteEP.programaAcademico.value == "null") {
        alert("Debe realizar la busqueda del reporte para poder imprimirlo");
        escuelaProce.programa.focus();
        return false;
    }

    if (reporteEP.bandera.value == 0) {
        alert("El reporte esta vac\u00edo");
        escuelaProce.programa.focus();
        return false;
    }

    confirmar = confirm("Revise que la Orientaci\u00f3n de la Hoja para la Impresi\u00f3n sea Vertical");
    if (confirmar)
        javascript:window.print();
    else
        return false;
}

function validaEG(formulario) {
    if (formulario.programa.selectedIndex == 0) {
        alert("Tiene que elegir el Programa Acad\u00e9mico");
        formulario.programa.focus();
        return false;
    }

    if (formulario.periodo.selectedIndex == 0) {
        alert("Tiene que elegir el Periodo Escolar");
        formulario.periodo.focus();
        return false;
    }

    return true;
}

function validaB(formulario) {
    if (formulario.programa.selectedIndex == 0) {
        alert("Tiene que elegir el Programa Acad\u00e9mico");
        formulario.programa.focus();
        return false;
    }

    if (formulario.periodo.selectedIndex == 0) {
        alert("Tiene que elegir el Periodo Escolar");
        formulario.periodo.focus();
        return false;
    }

    if (formulario.tipoBaja.selectedIndex == 0) {
        alert("Tiene que elegir el Tipo de Baja");
        formulario.tipoBaja.focus();
        return false;
    }

    return true;
}

function validaRE(formulario) {
    if (formulario.nivel.selectedIndex == 0) {
        alert("Tiene que elegir el Nivel Acad\u00e9mico");
        formulario.nivel.focus();
        return false;
    }

    if (formulario.programa.selectedIndex == 0) {
        alert("Tiene que elegir el Programa Acad\u00e9mico");
        formulario.programa.focus();
        return false;
    }

    if (formulario.periodo.selectedIndex == 0) {
        alert("Tiene que elegir el Periodo Escolar");
        formulario.periodo.focus();
        return false;
    }

    if (formulario.semestre.selectedIndex == 0) {
        alert("Tiene que elegir el Semestre");
        formulario.semestre.focus();
        return false;
    }

    if (formulario.grupo.selectedIndex == 0) {
        alert("Tiene que elegir el Grupo");
        formulario.grupo.focus();
        return false;
    }

    return true;
}

function validaDLP(formulario) {
    if (formulario.nivel.selectedIndex == 0) {
        alert("Tiene que elegir el Nivel Acad\u00e9mico");
        formulario.nivel.focus();
        return false;
    }

    if (formulario.programa.selectedIndex == 0) {
        alert("Tiene que elegir el Programa Acad\u00e9mico");
        formulario.programa.focus();
        return false;
    }

    if (formulario.periodo.selectedIndex == 0) {
        alert("Tiene que elegir el Periodo Escolar");
        formulario.periodo.focus();
        return false;
    }

    if (formulario.semestre.selectedIndex == 0) {
        alert("Tiene que elegir el Semestre");
        formulario.semestre.focus();
        return false;
    }

    if (formulario.grupo.selectedIndex == 0) {
        alert("Tiene que elegir el Grupo");
        formulario.grupo.focus();
        return false;
    }

    return true;
}


/**********************************
 Validaciones Gerencial Admesc
 ***********************************/

function validaGerenAdmesc(formulario) {
    if (formulario.nivel.selectedIndex == 0) {
        alert("Tiene que elegir el Nivel Acad\u00e9mico");
        formulario.nivel.focus();
        return false;
    }

    if (formulario.modalidad.selectedIndex == 0) {
        alert("Tiene que elegir la Modalidad");
        formulario.modalidad.focus();
        return false;
    }

    if (formulario.turno.selectedIndex == 0) {
        alert("Tiene que elegir el Turno");
        formulario.turno.focus();
        return false;
    }

    if (formulario.periodo.selectedIndex == 0) {
        alert("Tiene que elegir el Periodo Escolar");
        formulario.periodo.focus();
        return false;
    }

    return true;
}

/*
 * 
 * @param {type} formulario
 * @returns {Boolean}Agregamos validacion de Prespuestos Semestre Completo
 */
function validaPresupuestoSemestreCompleto(formulario) {
    if (formulario.nivel.selectedIndex == 0) {
        alert("Tiene que elegir el Nivel Acad\u00e9mico");
        formulario.nivel.focus();
        return false;
    }

    if (formulario.modalidad.selectedIndex == 0) {
        alert("Tiene que elegir la Modalidad");
        formulario.modalidad.focus();
        return false;
    }

    if (formulario.programa.selectedIndex == 0) {
        alert("Tiene que elegir un Programa")
        formulario.programa.focus();
        return false;
    }

    if (formulario.periodo.selectedIndex == 0) {
        alert("Tiene que elegir el Periodo Escolar");
        formulario.periodo.focus();
        return false;
    }

    if (formulario.semestre.selectedIndex == 0) {
        alert("Tiene que elegir el Semestre");
        formulario.semestre.focus();
        return false;
    }

    if (formulario.grupo.selectedIndex == 0) {
        alert("Tiene que elegir un grupo");
        formulario.grupo.focus();
        return false;
    }


    return true;
}

function validaBajaGerencial(formulario) {
    if (formulario.nivel.selectedIndex == 0) {
        alert("Tiene que elegir el Nivel Acad\u00e9mico");
        formulario.nivel.focus();
        return false;
    }

    if (formulario.modalidad.selectedIndex == 0) {
        alert("Tiene que elegir la Modalidad");
        formulario.modalidad.focus();
        return false;
    }

    if (formulario.turno.selectedIndex == 0) {
        alert("Tiene que elegir el Turno");
        formulario.turno.focus();
        return false;
    }

    if (formulario.periodo.selectedIndex == 0) {
        alert("Tiene que elegir el Periodo Escolar");
        formulario.periodo.focus();
        return false;
    }

    if (formulario.tipoBaja.selectedIndex == 0) {
        alert("Tiene que elegir el Tipo de Baja");
        formulario.tipoBaja.focus();
        return false;
    }

    return true;
}

function validaImpresionGerenAdmesc(reporteEP, escuelaProce) {
    if (reporteEP.nivelAcademico.value == "") {
        alert("Debe realizar la busqueda del reporte para poder imprimirlo");
        escuelaProce.nivel.focus();
        return false;
    }

    if (reporteEP.nivelAcademico.value == "null") {
        alert("Debe realizar la busqueda del reporte para poder imprimirlo");
        escuelaProce.nivel.focus();
        return false;
    }

    if (reporteEP.bandera.value == 0) {
        alert("El reporte esta vac\u00edo");
        escuelaProce.nivel.focus();
        return false;
    }

    confirmar = confirm("Revise que la Orientaci\u00f3n de la Hoja para la Impresi\u00f3n sea Vertical");
    if (confirmar)
        javascript:window.print();
    else
        return false;
}

function validaImpresionGerenAdmesc2(reporteEP, escuelaProce) {
    if (reporteEP.nivelAcademico.value == "") {
        alert("Debe realizar la busqueda del reporte para poder imprimirlo");
        escuelaProce.nivel.focus();
        return false;
    }

    if (reporteEP.nivelAcademico.value == "null") {
        alert("Debe realizar la busqueda del reporte para poder imprimirlo");
        escuelaProce.nivel.focus();
        return false;
    }

    if (reporteEP.bandera.value == 0) {
        alert("El reporte esta vac\u00edo");
        escuelaProce.nivel.focus();
        return false;
    }

    confirmar = confirm("Revise que la Orientaci\u00f3n de la Hoja para la Impresi\u00f3n sea Vertical");
    if (confirmar)
        javascript:window.print();
    else
        

    return false;
}





/**********************************
 Validaciones Global Becas
 ***********************************/

function validaGlobalBecas(formulario) {
    if (formulario.programa.selectedIndex == 0) {
        alert("Tiene que elegir el Programa Acad\u00e9mico");
        formulario.programa.focus();
        return false;
    }

    if (formulario.periodo.selectedIndex == 0) {
        alert("Tiene que elegir el Periodo Escolar");
        formulario.periodo.focus();
        return false;
    }

    if (formulario.tBeca.selectedIndex == 0) {
        alert("Tiene que elegir el tipo de Beca");
        formulario.tBeca.focus();
        return false;
    }

    return true;
}

function validaImpresionGlobalBecas(reporteTB, tipoBeca) {
    if (reporteTB.programaAcademico.value == "") {
        alert("Debe realizar la busqueda del reporte para poder imprimirlo");
        tipoBeca.programa.focus();
        return false;
    }

    if (reporteTB.programaAcademico.value == "null") {
        alert("Debe realizar la busqueda del reporte para poder imprimirlo");
        tipoBeca.programa.focus();
        return false;
    }

    if (reporteTB.bandera.value == 0) {
        alert("El reporte esta vac\u00edo");
        tipoBeca.programa.focus();
        return false;
    }

    confirmar = confirm("Revise que la Orientaci\u00f3n de la Hoja para la Impresi\u00f3n sea Vertical");
    if (confirmar)
        javascript:window.print();
    else
        return false;
}

/**********************************
 Validaciones Gerencial Becas
 ***********************************/

function validaGerencialBecas(formulario) {
    if (formulario.nivel.selectedIndex == 0) {
        alert("Tiene que elegir el Nivel Acad\u00e9mico");
        formulario.nivel.focus();
        return false;
    }

    if (formulario.modalidad.selectedIndex == 0) {
        alert("Tiene que elegir la Modalidad");
        formulario.modalidad.focus();
        return false;
    }

    if (formulario.turno.selectedIndex == 0) {
        alert("Tiene que elegir el Turno");
        formulario.turno.focus();
        return false;
    }

    if (formulario.periodo.selectedIndex == 0) {
        alert("Tiene que elegir el Periodo Escolar");
        formulario.periodo.focus();
        return false;
    }

    if (formulario.tBeca.selectedIndex == 0) {
        alert("Tiene que elegir el Tipo de Beca");
        formulario.tBeca.focus();
        return false;
    }

    return true;
}

function validaImpresionGerencialBecas(reporteTB, tipoBeca) {
    if (reporteTB.nivelAcademico.value == "") {
        alert("Debe realizar la busqueda del reporte para poder imprimirlo");
        tipoBeca.nivel.focus();
        return false;
    }

    if (reporteTB.nivelAcademico.value == "null") {
        alert("Debe realizar la busqueda del reporte para poder imprimirlo");
        tipoBeca.nivel.focus();
        return false;
    }

    if (reporteTB.bandera.value == 0) {
        alert("El reporte esta vac\u00edo");
        tipoBeca.nivel.focus();
        return false;
    }

    confirmar = confirm("Revise que la Orientaci\u00f3n de la Hoja para la Impresi\u00f3n sea Vertical");
    if (confirmar)
        javascript:window.print();
    else
        return false;
}

/**********************************
 Validaciones Global Finanzas
 ***********************************/

//Para la impresión de Adeudos de Colegiatura se usa validaImpresion()

function validaPC(formulario) {
    if (formulario.nivel.selectedIndex == 0) {
        alert("Tiene que elegir el Nivel Acad\u00e9mico");
        formulario.nivel.focus();
        return false;
    }

    if (formulario.programa.selectedIndex == 0) {
        alert("Tiene que elegir el Programa Acad\u00e9mico");
        formulario.programa.focus();
        return false;
    }

    if (formulario.periodo.selectedIndex == 0) {
        alert("Tiene que elegir el Periodo Escolar");
        formulario.periodo.focus();
        return false;
    }

    if (formulario.semestre.selectedIndex == 0) {
        alert("Tiene que elegir el Semestre");
        formulario.semestre.focus();
        return false;
    }

    if (formulario.grupo.selectedIndex == 0) {
        alert("Tiene que elegir el Grupo");
        formulario.grupo.focus();
        return false;
    }

    return true;
}

function validaAC(formulario) {
    if (formulario.nivel.selectedIndex == 0) {
        alert("Tiene que elegir el Nivel Acad\u00e9mico");
        formulario.nivel.focus();
        return false;
    }

    if (formulario.programa.selectedIndex == 0) {
        alert("Tiene que elegir el Programa Acad\u00e9mico");
        formulario.programa.focus();
        return false;
    }

    if (formulario.periodo.selectedIndex == 0) {
        alert("Tiene que elegir el Periodo Escolar");
        formulario.periodo.focus();
        return false;
    }

    if (formulario.semestre.selectedIndex == 0) {
        alert("Tiene que elegir el Semestre");
        formulario.semestre.focus();
        return false;
    }

    if (formulario.tipoAdeudo.selectedIndex == 0) {
        alert("Tiene que elegir el Grupo");
        formulario.tipoAdeudo.focus();
        return false;
    }

    return true;
}

function validaImpresionGlobalFinanzas(reportePC, pagosColegiatura) {
    if (reportePC.programaAcademico.value == "") {
        alert("Debe realizar la busqueda del reporte para poder imprimirlo");
        pagosColegiatura.programa.focus();
        return false;
    }

    if (reportePC.programaAcademico.value == "null") {
        alert("Debe realizar la busqueda del reporte para poder imprimirlo");
        pagosColegiatura.programa.focus();
        return false;
    }

    if (reportePC.bandera.value == 0) {
        alert("El reporte esta vac\u00edo");
        pagosColegiatura.programa.focus();
        return false;
    }

    confirmar = confirm("Revise que la Orientaci\u00f3n de la Hoja para la Impresi\u00f3n sea Horizontal");
    if (confirmar)
        javascript:window.print();
    else
        return false;
}

/**********************************
 Validaciones Gerencial Finanzas
 ***********************************/

//Para la impresión de Adeudos de Colegiatura se usa validaImpresionGerenAdmesc()

function validaGerenFinanzas(formulario) {
    if (formulario.nivel.selectedIndex == 0) {
        alert("Tiene que elegir el Nivel Acad\u00e9mico");
        formulario.nivel.focus();
        return false;
    }

    if (formulario.modalidad.selectedIndex == 0) {
        alert("Tiene que elegir la Modalidad");
        formulario.modalidad.focus();
        return false;
    }

    if (formulario.turno.selectedIndex == 0) {
        alert("Tiene que elegir el Turno");
        formulario.turno.focus();
        return false;
    }

    if (formulario.periodo.selectedIndex == 0) {
        alert("Tiene que elegir el Periodo Escolar");
        formulario.periodo.focus();
        return false;
    }

    return true;
}

function validaAdeudosGerencial(formulario) {
    if (formulario.nivel.selectedIndex == 0) {
        alert("Tiene que elegir el Nivel Acad\u00e9mico");
        formulario.nivel.focus();
        return false;
    }

    if (formulario.modalidad.selectedIndex == 0) {
        alert("Tiene que elegir la Modalidad");
        formulario.modalidad.focus();
        return false;
    }

    if (formulario.turno.selectedIndex == 0) {
        alert("Tiene que elegir el Turno");
        formulario.turno.focus();
        return false;
    }

    if (formulario.periodo.selectedIndex == 0) {
        alert("Tiene que elegir el Periodo Escolar");
        formulario.periodo.focus();
        return false;
    }

    if (formulario.tipoAdeudo.selectedIndex == 0) {
        alert("Tiene que elegir el Tipo de Adeudo");
        formulario.tipoAdeudo.focus();
        return false;
    }

    return true;
}

function validaImpresionGerenFinanzas(reportePC, pagosColegiatura) {
    if (reportePC.nivelAcademico.value == "") {
        alert("Debe realizar la busqueda del reporte para poder imprimirlo");
        pagosColegiatura.nivel.focus();
        return false;
    }

    if (reportePC.nivelAcademico.value == "null") {
        alert("Debe realizar la busqueda del reporte para poder imprimirlo");
        pagosColegiatura.nivel.focus();
        return false;
    }

    if (reportePC.bandera.value == 0) {
        alert("El reporte esta vac\u00edo");
        pagosColegiatura.nivel.focus();
        return false;
    }

    confirmar = confirm("Revise que la Orientaci\u00f3n de la Hoja para la Impresi\u00f3n sea Horizontal");
    if (confirmar)
        javascript:window.print();
    else
        return false;
}
/************************************
 Validaciones Global Servicio Social
 *************************************/

function validaPSS(formulario) {
    if (formulario.programa.selectedIndex == 0) {
        alert("Tiene que elegir el Programa Acad\u00e9mico");
        formulario.programa.focus();
        return false;
    }

    if (formulario.periodo.selectedIndex == 0) {
        alert("Tiene que elegir el Periodo Escolar");
        formulario.periodo.focus();
        return false;
    }

    if (formulario.tipoPrestador.selectedIndex == 0) {
        alert("Tiene que elegir el Tipo de Prestador de Servicio Social");
        formulario.tipoPrestador.focus();
        return false;
    }

    return true;
}

function validaESS(formulario) {
    if (formulario.programa.selectedIndex == 0) {
        alert("Tiene que elegir el Programa Acad\u00e9mico");
        formulario.programa.focus();
        return false;
    }

    if (formulario.periodo.selectedIndex == 0) {
        alert("Tiene que elegir el Periodo Escolar");
        formulario.periodo.focus();
        return false;
    }

    if (formulario.empresa.selectedIndex == 0) {
        alert("Tiene que elegir la Empresa");
        formulario.empresa.focus();
        return false;
    }

    return true;
}

function validaNISS(formulario) {
    if (formulario.programa.selectedIndex == 0) {
        alert("Tiene que elegir el Programa Acad\u00e9mico");
        formulario.programa.focus();
        return false;
    }

    if (formulario.periodo.selectedIndex == 0) {
        alert("Tiene que elegir el Periodo Escolar");
        formulario.periodo.focus();
        return false;
    }

    return true;
}

function validaImpresionGlobalServSoc(reportePSS, prestadoresSS) {
    if (reportePSS.programaAcademico.value == "") {
        alert("Debe realizar la busqueda del reporte para poder imprimirlo");
        prestadoresSS.programa.focus();
        return false;
    }

    if (reportePSS.programaAcademico.value == "null") {
        alert("Debe realizar la busqueda del reporte para poder imprimirlo");
        prestadoresSS.programa.focus();
        return false;
    }

    if (reportePSS.bandera.value == 0) {
        alert("El reporte esta vac\u00edo");
        prestadoresSS.programa.focus();
        return false;
    }

    confirmar = confirm("Revise que la Orientaci\u00f3n de la Hoja para la Impresi\u00f3n sea Vertical");
    if (confirmar)
        javascript:window.print();
    else
        return false;
}

/***************************************
 Validaciones Gerencial Servicio Social	
 ****************************************/

//Reutiliza validaImpresionGerenFinanzas() para la impresion en horizontal

function validaGerenServSoc(formulario) {
    if (formulario.nivel.selectedIndex == 0) {
        alert("Tiene que elegir el Nivel Acad\u00e9mico");
        formulario.nivel.focus();
        return false;
    }

    if (formulario.modalidad.selectedIndex == 0) {
        alert("Tiene que elegir la Modalidad");
        formulario.modalidad.focus();
        return false;
    }

    if (formulario.turno.selectedIndex == 0) {
        alert("Tiene que elegir el Turno");
        formulario.turno.focus();
        return false;
    }

    if (formulario.periodo.selectedIndex == 0) {
        alert("Tiene que elegir el Periodo Escolar");
        formulario.periodo.focus();
        return false;
    }

    if (formulario.tipoPrestador.selectedIndex == 0) {
        alert("Tiene que elegir el Tipo de Prestador");
        formulario.tipoPrestador.focus();
        return false;
    }

    return true;
}

function validaEstadisticaGerencial(formulario) {
    if (formulario.nivel.selectedIndex == 0) {
        alert("Tiene que elegir el Nivel Acad\u00e9mico");
        formulario.nivel.focus();
        return false;
    }

    if (formulario.modalidad.selectedIndex == 0) {
        alert("Tiene que elegir la Modalidad");
        formulario.modalidad.focus();
        return false;
    }

    if (formulario.turno.selectedIndex == 0) {
        alert("Tiene que elegir el Turno");
        formulario.turno.focus();
        return false;
    }

    if (formulario.periodo.selectedIndex == 0) {
        alert("Tiene que elegir el Periodo Escolar");
        formulario.periodo.focus();
        return false;
    }

    if (formulario.empresa.selectedIndex == 0) {
        alert("Tiene que elegir la Empresa");
        formulario.empresa.focus();
        return false;
    }

    return true;
}

function validaNoInscritosGerencial(formulario) {
    if (formulario.nivel.selectedIndex == 0) {
        alert("Tiene que elegir el Nivel Acad\u00e9mico");
        formulario.nivel.focus();
        return false;
    }

    if (formulario.modalidad.selectedIndex == 0) {
        alert("Tiene que elegir la Modalidad");
        formulario.modalidad.focus();
        return false;
    }

    if (formulario.turno.selectedIndex == 0) {
        alert("Tiene que elegir el Turno");
        formulario.turno.focus();
        return false;
    }

    if (formulario.periodo.selectedIndex == 0) {
        alert("Tiene que elegir el Periodo Escolar");
        formulario.periodo.focus();
        return false;
    }

    return true;
}

function validaImpresionGerenServSoc(reporteESS, estadisticaSS) {
    if (reporteESS.nivelAcademico.value == "") {
        alert("Debe realizar la busqueda del reporte para poder imprimirlo");
        estadisticaSS.nivel.focus();
        return false;
    }

    if (reporteESS.nivelAcademico.value == "null") {
        alert("Debe realizar la busqueda del reporte para poder imprimirlo");
        estadisticaSS.nivel.focus();
        return false;
    }

    if (reporteESS.bandera.value == 0) {
        alert("El reporte esta vac\u00edo");
        estadisticaSS.nivel.focus();
        return false;
    }

    confirmar = confirm("Revise que la Orientaci\u00f3n de la Hoja para la Impresi\u00f3n sea Vertical");
    if (confirmar)
        javascript:window.print();
    else
        return false;
}

/**********************************
 Validaciones Alumno
 ***********************************/

function validaAlumno(formulario) {
    if (formulario.matriculaAlumno.value == "" && formulario.nombreAlumno.value == "") {
        alert("Tiene que proporcionar la matr\u00edcula o el nombre del alumno");
        formulario.matriculaAlumno.focus();
        return false;
    }

    return true;
}

function validaImpresionAlumno(reporteAlumno, alumno) {
    if (reporteAlumno.claveAlumno.value == "") {
        alert("Debe realizar la busqueda del reporte para poder imprimirlo");
        alumno.matriculaAlumno.focus();
        return false;
    }

    if (reporteAlumno.claveAlumno.value == "null") {
        alert("Debe realizar la busqueda del reporte para poder imprimirlo");
        alumno.matriculaAlumno.focus();
        return false;
    }

    if (reporteAlumno.bandera.value == 0) {
        alert("El reporte esta vac\u00edo");
        alumno.matriculaAlumno.focus();
        return false;
    }

    confirmar = confirm("Revise que la Orientaci\u00f3n de la Hoja para la Impresi\u00f3n sea Vertical");
    if (confirmar)
        javascript:window.print();
    else
        return false;
}