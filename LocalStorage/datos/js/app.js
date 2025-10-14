const btnGuardar = document.querySelector(".btnGuardar")

const nombre = document.querySelector(".nombre")

const apellidoP = document.querySelector(".apellidoP")
const apellidoM = document.querySelector(".apellidoM")

const date = document.querySelector(".date")

const saludo = document.querySelector(".saludo")
const apellidos = document.querySelector(".apellidos")
const divDate = document.querySelector(".divDate")


const textoGuardado = localStorage.getItem("texto");
const textoGuardadoA = localStorage.getItem("textoApellido", "textoAepllidoM");
const textoGuardadoD = localStorage.getItem("dateText");

if(textoGuardado!= "" && textoGuardadoA != "" && textoGuardadoD != ""){
    saludo.textContent = `Guardado: ${textoGuardado}`
    apellidos.textContent = `Guardado: ${textoGuardadoA}`
    divDate.textContent = `Guardado: ${textoGuardadoD}`
}

btnGuardar.addEventListener("click", () =>{
    const texto = nombre.value;
    const textoApellido = apellidoP.value;
    const textoApellidoM = apellidoM.value;
    const dateText = date.value;

    if(texto!= "" && textoApellido != ""  && textoApellidoM != "" && dateText != ""){
        localStorage.setItem('texto', texto);
        localStorage.setItem('textoApellido', textoApellido);
        localStorage.setItem('textoAepllidoM', textoApellidoM);
        localStorage.setItem('dateText', dateText);

        saludo.textContent = `Guardado: ${texto}`;
        apellidos.textContent = `Apellidos: ${textoApellido} ${textoApellidoM}`;
        divDate.textContent = `Fecha: ${dateText}`;
    }
});
