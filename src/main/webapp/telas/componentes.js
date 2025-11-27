class HeaderComponent extends HTMLElement {
    connectedCallback() {
        this.innerHTML = `
            <div id="topbarr">
                <p>inicio barra do topo</p>
                <ul>
                    <li>
                        <p>placeholder logo</p>
                    </li>   
                    <li><a href="./placeholder.jsp">sobre o conecta</a></li>
                    <li><a href="./placeholder.jsp">pesquisar cursos</a></li>
                    <li><a href="./placeholder.jsp">parceiros</a></li>
                </ul>
                <p>fim barra do topo</p>
            </div>
            <div id="sidebar">
                <p>inicio barra lateral</p>
                <nav>
                    <ul>
                        <li><p>place holder hamburguer menu</p></li>
                        <li><a href="./homeProfessor.jsp">home</a></li>
                        <li><a href="./cursos.jsp">meus cursos</a></li>
                        <li><a href="./turmas.jsp">minhas turmas</a></li>
                        <li><a href="./material.jsp">material</a></li>
                        <li><a href="./perfil.jsp">perfil</a></li>
                        <p>fim barra lateral</p>
                    </ul>
                </nav>
            </div>
        `;
    }
}
customElements.define('header-component', HeaderComponent);