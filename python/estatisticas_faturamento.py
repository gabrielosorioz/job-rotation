import json

def estatisticas_faturamento(dados_faturamento):
    if not dados_faturamento or all(dia['valor'] == 0 for dia in dados_faturamento):
        return None

    faturamento = [dia['valor'] for dia in dados_faturamento if dia['valor'] > 0]

    return min(faturamento), max(faturamento), sum(valor > sum(faturamento) / len(faturamento) for valor in faturamento),  sum(faturamento) / len(faturamento)

with open('python/faturamento.json', 'r') as file:
    dados_faturamento = json.load(file)


resultado = estatisticas_faturamento(dados_faturamento)

if resultado:
    menor, maior, acima_media, media = resultado
    print(f"Menor faturamento: {menor}")
    print(f"Maior faturamento: {maior}")
    print(f"Dias acima da média: {acima_media}")
    print(f"Média de faturamento: {media: .2f}")
else:
    print("Não há dados ou todos os dias tiveram faturamento zero.")
