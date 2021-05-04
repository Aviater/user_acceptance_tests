main = () => {
    handleMessage();
    handleOrderStock();
    handleQueryStock();
}

handleMessage = async () => {
    const parser = new DOMParser();

    const xmlResponse = await fetch('http://localhost:5000/message')
        .then((res) => {
            return res.text();
        })
        .then((data) => {
            const dom = parser.parseFromString(data, "text/xml");
            return dom;
        })

    document.write("<div>");
    document.write('<h1>' + xmlResponse.documentElement.nodeName + '</h1>');
    document.write('<h2>' + xmlResponse.documentElement.childNodes[1].nodeName + '</h2>');
    document.write('<h3>' + xmlResponse.documentElement.childNodes[1].childNodes[1].nodeName + '</h3>');
    const items = xmlResponse.getElementsByTagName('Item');
    for(let i = 0; i < items.length; i++) {
        document.write('<ul>');
        document.write('<li>' + items[i].nodeName + '</li>');
        document.write('<ul>');
        document.write('<li>' + items[i].childNodes[1].nodeName + ': ' + items[i].childNodes[1].textContent + '</p>');
        document.write('<li>' + items[i].childNodes[3].nodeName + ': ' + items[i].childNodes[3].textContent + '</p>');
        document.write('</ul>');
        document.write('</ul>');
    }
    document.write('<h2>' + xmlResponse.documentElement.childNodes[3].nodeName + '</h2>');
    document.write('<h3>' + xmlResponse.documentElement.childNodes[3].childNodes[1].nodeName + '</h3>');
    document.write('<ul>');
    document.write('<li>' + xmlResponse.documentElement.childNodes[3].childNodes[1].getAttribute('sent') + '</li>');
    document.write('</ul>');
    document.write('<h2>' + xmlResponse.documentElement.childNodes[5].nodeName + '</h2>');
    document.write('<h3>' + xmlResponse.documentElement.childNodes[5].childNodes[1].nodeName + '</h3>');
    document.write('<ul>');
    document.write('<li>' + xmlResponse.documentElement.childNodes[5].childNodes[1].getAttribute('received') + '</li>');
    document.write('</ul>');
    document.write("</div>");
    document.write("<hr>");
}

handleOrderStock = async () => {
    const parser = new DOMParser();

    const xmlResponse = await fetch('http://localhost:5000/order_stock')
        .then((res) => {
            return res.text();
        })
        .then((data) => {
            const dom = parser.parseFromString(data, "text/xml");
            return dom;
        })

    document.write("<div>");
    document.write('<h1>' + xmlResponse.documentElement.nodeName + '</h1>');
    document.write('<h2>' + xmlResponse.documentElement.childNodes[1].nodeName + '</h2>');
    document.write('<h3>' + xmlResponse.documentElement.childNodes[1].childNodes[1].nodeName + '</h3>');
    const items = xmlResponse.getElementsByTagName('Item');
    for(let i = 0; i < items.length; i++) {
        document.write('<ul>');
        document.write('<li>' + items[i].nodeName + '</li>');
        document.write('<ul>');
        document.write('<li>' + items[i].childNodes[1].nodeName + ': ' + items[i].childNodes[1].textContent + '</p>');
        document.write('<li>' + items[i].childNodes[3].nodeName + ': ' + items[i].childNodes[3].textContent + '</p>');
        document.write('</ul>');
        document.write('</ul>');
    }
    document.write('<h2>' + xmlResponse.documentElement.childNodes[3].nodeName + '</h2>');
    document.write('<h3>' + xmlResponse.documentElement.childNodes[3].childNodes[1].nodeName + '</h3>');
    document.write('<ul>');
    document.write('<li>' + xmlResponse.documentElement.childNodes[3].childNodes[1].getAttribute('sent') + '</li>');
    document.write('</ul>');
    document.write('<h2>' + xmlResponse.documentElement.childNodes[5].nodeName + '</h2>');
    document.write('<h3>' + xmlResponse.documentElement.childNodes[5].childNodes[1].nodeName + '</h3>');
    document.write('<ul>');
    document.write('<li>' + xmlResponse.documentElement.childNodes[5].childNodes[1].getAttribute('received') + '</li>');
    document.write('</ul>');
    document.write("</div>");
    document.write("<hr>");
}

handleQueryStock = async () => {
    const parser = new DOMParser();

    const xmlResponse = await fetch('http://localhost:5000/query_stock')
        .then((res) => {
            return res.text();
        })
        .then((data) => {
            const dom = parser.parseFromString(data, "text/xml");
            return dom;
        })

    document.write("<div>");
    document.write('<h1>' + xmlResponse.documentElement.nodeName + '</h1>');
    document.write('<h2>' + xmlResponse.documentElement.childNodes[1].nodeName + '</h2>');
    document.write('<h3>' + xmlResponse.documentElement.childNodes[1].childNodes[1].nodeName + '</h3>');
    document.write('<ul>');
    document.write('<li>' + xmlResponse.documentElement.childNodes[1].childNodes[1].childNodes[1].nodeName + ': ' + xmlResponse.documentElement.childNodes[1].childNodes[1].childNodes[1].textContent + '</li>');
    document.write('</ul>');
    document.write('<h2>' + xmlResponse.documentElement.childNodes[3].nodeName + '</h2>');
    document.write('<h3>' + xmlResponse.documentElement.childNodes[3].childNodes[1].nodeName + '</h3>');
    document.write('<ul>');
    document.write('<li>' + xmlResponse.documentElement.childNodes[3].childNodes[1].getAttribute('sent') + '</li>');
    document.write('</ul>');
    document.write('<h2>' + xmlResponse.documentElement.childNodes[5].nodeName + '</h2>');
    document.write('<h3>' + xmlResponse.documentElement.childNodes[5].childNodes[1].nodeName + '</h3>');
    document.write('<h4>' + xmlResponse.documentElement.childNodes[5].childNodes[1].childNodes[1].nodeName + '</h4>');
    document.write('<ul>');
    document.write('<li>' + xmlResponse.documentElement.childNodes[5].childNodes[1].childNodes[1].childNodes[1].nodeName + ': ' + xmlResponse.documentElement.childNodes[5].childNodes[1].childNodes[1].childNodes[1].textContent + '</li>');
    document.write('<li>' + xmlResponse.documentElement.childNodes[5].childNodes[1].childNodes[1].childNodes[3].nodeName + ': ' + xmlResponse.documentElement.childNodes[5].childNodes[1].childNodes[1].childNodes[3].textContent + '</li>');
    document.write('</ul>');
    document.write("</div>");
    document.write("<hr>");
}

main();