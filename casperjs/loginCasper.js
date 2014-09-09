casper.test.begin('Login no QuickLoja', 3, function suite(test) {
    
	casper.start("http://www.planned.by/quickloja/", function() {
        test.assertTitle("Login | QuickLoja Web", "pagina de login do quickloja");
        test.assertExists('form[class="form-signin"]', "encontrou formulario");
        this.fill('form[class="form-signin"]', {
            usuariologin: "elias.nogueira",
            usuariosenha: "123"
        }, true);
    });

    casper.then(function() {
        test.assertTitle("Administração QuickLoja", "entrou na administração");
    });

    casper.run(function() {
        test.done();
    });
});