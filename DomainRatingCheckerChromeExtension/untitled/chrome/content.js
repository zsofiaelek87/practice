function handleSelection(event) {
  const selectedText = window.getSelection().toString().trim();
  const regex = /^([\w-]+\.)*([\w-]+\.[a-zA-Z]{2,9})$/;
  if (regex.test(selectedText)) {
    const url = `https://${selectedText}`;
    const tooltip = document.createElement("div");
    tooltip.innerText = `Domain rating for ${selectedText}: `;
    tooltip.style.position = "absolute";
    tooltip.style.background = "white";
    tooltip.style.border = "1px solid black";
    tooltip.style.padding = "5px";
    tooltip.style.zIndex = "9999";
    tooltip.style.top = `${event.pageY}px`;
    tooltip.style.left = `${event.pageX}px`;
    document.body.appendChild(tooltip);
    const iframe = document.createElement('iframe');
    iframe.src = `https://smallseotools.com/domain-rating-checker/?domain=${url}`;
    iframe.style.width = '100%';
    iframe.style.height = '200px';
    tooltip.appendChild(iframe);
    const button = document.createElement('button');
    button.innerText = 'Get Domain Rating';
    button.onclick = async function() {
      try {
        const response = await fetch(`https://smallseotools.com/domain-rating-checker/?domain=${url}`, {
          headers: {
            "User-Agent": "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/58.0.3029.110 Safari/537.3"
          }
        });
        if (!response.ok) {
          throw new Error(`Failed to fetch domain rating for ${url}`);
        }

        const html = await response.text();
        const parser = new DOMParser();
        const doc = parser.parseFromString(html, "text/html");
        const ratingElement = doc.querySelector(".domain-rating-score");
        if (!ratingElement) {
          throw new Error(`Failed to parse domain rating for ${url}`);
        }

        const rating = parseFloat(ratingElement.textContent);
        if (isNaN(rating)) {
          throw new Error(`Failed to parse domain rating for ${url}`);
        }

        tooltip.innerText = `Domain rating for ${selectedText}: ${rating}`;
      } catch (error) {
        console.error(error);
        tooltip.innerText = `Failed to get domain rating for ${selectedText}`;
      }
    };
    tooltip.appendChild(button);
  }
}

document.addEventListener("mouseup", handleSelection);
