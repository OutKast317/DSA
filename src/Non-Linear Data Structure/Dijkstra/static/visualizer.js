const ROWS = 20;
const COLS = 20;
let grid = [];
let startCell = null;
let endCell = null;

function createGrid() {
    const gridContainer = document.getElementById('grid');
    gridContainer.innerHTML = '';
    grid = [];

    for (let r = 0; r < ROWS; r++) {
        const row = [];
        for (let c = 0; c < COLS; c++) {
            const cell = document.createElement('div');
            cell.className = 'cell';
            cell.dataset.row = r;
            cell.dataset.col = c;

            cell.onclick = () => handleCellClick(cell);
            gridContainer.appendChild(cell);
            row.push(cell);
        }
        grid.push(row);
    }
}

function handleCellClick(cell) {
    if (!startCell) {
        startCell = cell;
        cell.classList.add('start');
    } else if (!endCell && cell !== startCell) {
        endCell = cell;
        cell.classList.add('end');
    } else if (cell !== startCell && cell !== endCell) {
        cell.classList.toggle('wall');
    }
}

function startDijkstra() {
    if (!startCell || !endCell) return alert("Set both start and end points");

    const start = [parseInt(startCell.dataset.row), parseInt(startCell.dataset.col)];
    const end = [parseInt(endCell.dataset.row), parseInt(endCell.dataset.col)];

    let queue = [[...start, 0]]; // [row, col, distance]
    let visitedSet = new Set();
    let prev = {};  // Track where each cell came from

    function key(r, c) {
        return `${r},${c}`;
    }

    function visitNext() {
        if (queue.length === 0) return;

        const [r, c, dist] = queue.shift();
        const currentKey = key(r, c);
        if (visitedSet.has(currentKey)) return visitNext();

        visitedSet.add(currentKey);
        const cell = grid[r][c];
        if (cell !== startCell && cell !== endCell) cell.classList.add('visited');

        if (r === end[0] && c === end[1]) {
            drawShortestPath(prev, end);
            return;
        }

        const directions = [[-1,0],[1,0],[0,-1],[0,1]];
        for (let [dr, dc] of directions) {
            const nr = r + dr, nc = c + dc;
            const neighborKey = key(nr, nc);
            if (nr >= 0 && nc >= 0 && nr < ROWS && nc < COLS && !visitedSet.has(neighborKey)) {
                const neighbor = grid[nr][nc];
                if (!neighbor.classList.contains('wall')) {
                    queue.push([nr, nc, dist + 1]);
                    if (!prev[neighborKey]) {
                        prev[neighborKey] = currentKey;
                    }
                }
            }
        }

        setTimeout(visitNext, 30);
    }

    visitNext();
}

function drawShortestPath(prev, end) {
    let [r, c] = end;
    let path = [];
    let currentKey = `${r},${c}`;

    while (prev[currentKey]) {
        const [pr, pc] = prev[currentKey].split(',').map(Number);
        const cell = grid[pr][pc];

        if (cell !== startCell && cell !== endCell) {
            path.push(cell);
        }

        currentKey = prev[currentKey];
    }

    // Animate the path drawing
    path.reverse(); // from start to end
    let i = 0;
    const interval = setInterval(() => {
        if (i >= path.length) {
            clearInterval(interval);
            return;
        }
        
        path[i].classList.add('path');       
        i++;
    }, 40);
}

function clearGrid() {
    for (let r = 0; r < ROWS; r++) {
        for (let c = 0; c < COLS; c++) {
            const cell = grid[r][c];
            cell.classList.remove('start', 'end', 'wall', 'visited', 'path');
        }
    }
    startCell = null;
    endCell = null;
}



window.onload = createGrid;
